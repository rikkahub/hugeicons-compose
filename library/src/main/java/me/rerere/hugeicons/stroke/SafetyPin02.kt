package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SafetyPin02: ImageVector
    get() {
        if (_safetyPin02 != null) {
            return _safetyPin02!!
        }
        _safetyPin02 = ImageVector.Builder(
            name = "SafetyPin02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5459f, 3.79364f)
        lineTo(12.2929f, 5.4104f)
        curveTo(11.2216f, 6.79272f, 13.3531f, 8.46736f, 14.4395f, 7.07557f)
        lineTo(14.8139f, 6.59591f)
        curveTo(15.5066f, 5.70846f, 16.8119f, 5.61801f, 17.5969f, 6.40307f)
        curveTo(18.382f, 7.18812f, 18.2915f, 8.49338f, 17.4041f, 9.18609f)
        lineTo(16.9244f, 9.56049f)
        curveTo(15.5326f, 10.6469f, 17.2073f, 12.7784f, 18.5896f, 11.7071f)
        lineTo(20.2064f, 10.4541f)
        curveTo(22.4319f, 8.7293f, 22.6147f, 5.42276f, 20.596f, 3.40405f)
        curveTo(18.5772f, 1.38533f, 15.2707f, 1.56805f, 13.5459f, 3.79364f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 17.4103f)
        lineTo(7f, 5f)
        moveTo(6.58974f, 21f)
        lineTo(17f, 12f)
        }
        }.build()

        return _safetyPin02!!
    }

private var _safetyPin02: ImageVector? = null
