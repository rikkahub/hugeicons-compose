package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HairClips: ImageVector
    get() {
        if (_hairClips != null) {
            return _hairClips!!
        }
        _hairClips = ImageVector.Builder(
            name = "HairClips",
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
        moveTo(9.34857f, 12.332f)
        curveTo(8.34842f, 14.3859f, 12.5556f, 16.0308f, 10.9976f, 18.0004f)
        curveTo(9.49206f, 19.3883f, 7.84607f, 15.6206f, 4.5f, 15.5005f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4.43903f)
        curveTo(16.6511f, 2.83733f, 13.1197f, 5.85076f, 11.0697f, 9.71325f)
        curveTo(8.66575f, 14.2427f, 5.84955f, 15.3123f, 2f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 20f)
        curveTo(7f, 20f, 8f, 18f, 8f, 18f)
        moveTo(10.7143f, 15.2941f)
        curveTo(12.8448f, 12.2758f, 15.2857f, 10f, 21f, 10f)
        }
        }.build()

        return _hairClips!!
    }

private var _hairClips: ImageVector? = null
