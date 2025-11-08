package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sad02: ImageVector
    get() {
        if (_sad02 != null) {
            return _sad02!!
        }
        _sad02 = ImageVector.Builder(
            name = "Sad02",
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
        moveTo(9.5f, 21.685f)
        curveTo(10.299f, 21.8906f, 11.1368f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 12.3375f, 2.01672f, 12.6711f, 2.04938f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.02108f, 14f)
        lineTo(2.8602f, 16.0826f)
        curveTo(1.69974f, 17.2204f, 1.71976f, 19.0523f, 2.88023f, 20.1707f)
        curveTo(4.06071f, 21.2892f, 5.96146f, 21.2699f, 7.12193f, 20.1515f)
        curveTo(8.30241f, 19.0137f, 8.2824f, 17.1818f, 7.12193f, 16.0633f)
        lineTo(5.02108f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00897f, 8.4422f)
        horizontalLineTo(8f)
        moveTo(16f, 8.4422f)
        horizontalLineTo(15.991f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        curveTo(14.1644f, 15.3721f, 13.1256f, 15f, 12f, 15f)
        curveTo(11.0893f, 15f, 10.2354f, 15.2436f, 9.5f, 15.6692f)
        }
        }.build()

        return _sad02!!
    }

private var _sad02: ImageVector? = null
