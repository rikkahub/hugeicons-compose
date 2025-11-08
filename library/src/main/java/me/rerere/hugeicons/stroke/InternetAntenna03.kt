package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InternetAntenna03: ImageVector
    get() {
        if (_internetAntenna03 != null) {
            return _internetAntenna03!!
        }
        _internetAntenna03 = ImageVector.Builder(
            name = "InternetAntenna03",
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
        moveTo(4f, 18.001f)
        curveTo(2.74418f, 16.3295f, 2f, 14.2516f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 14.2516f, 21.2558f, 16.3295f, 20f, 18.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.52779f, 16f)
        curveTo(6.57771f, 14.9385f, 6f, 13.5367f, 6f, 12f)
        curveTo(6f, 8.68629f, 8.68629f, 6f, 12f, 6f)
        curveTo(15.3137f, 6f, 18f, 8.68629f, 18f, 12f)
        curveTo(18f, 13.5367f, 17.4223f, 14.9385f, 16.4722f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        verticalLineTo(22f)
        moveTo(9f, 22f)
        horizontalLineTo(15f)
        }
        }.build()

        return _internetAntenna03!!
    }

private var _internetAntenna03: ImageVector? = null
