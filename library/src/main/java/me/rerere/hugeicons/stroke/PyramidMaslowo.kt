package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PyramidMaslowo: ImageVector
    get() {
        if (_pyramidMaslowo != null) {
            return _pyramidMaslowo!!
        }
        _pyramidMaslowo = ImageVector.Builder(
            name = "PyramidMaslowo",
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
        moveTo(7.75024f, 7.56659f)
        curveTo(9.66926f, 4.5222f, 10.6288f, 3f, 12f, 3f)
        curveTo(13.3712f, 3f, 14.3307f, 4.52219f, 16.2498f, 7.56658f)
        lineTo(18.4941f, 11.1271f)
        curveTo(21.2362f, 15.4772f, 22.6072f, 17.6522f, 21.7426f, 19.3261f)
        curveTo(20.878f, 21f, 18.3834f, 21f, 13.3944f, 21f)
        horizontalLineTo(10.6056f)
        curveTo(5.61655f, 21f, 3.12205f, 21f, 2.25742f, 19.3261f)
        curveTo(1.3928f, 17.6522f, 2.76382f, 15.4772f, 5.50587f, 11.1271f)
        lineTo(7.75024f, 7.56659f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 15f)
        horizontalLineTo(9f)
        moveTo(20.5f, 15f)
        horizontalLineTo(15f)
        moveTo(7f, 9f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        lineTo(12f, 21f)
        }
        }.build()

        return _pyramidMaslowo!!
    }

private var _pyramidMaslowo: ImageVector? = null
