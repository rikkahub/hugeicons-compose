package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pie: ImageVector
    get() {
        if (_pie != null) {
            return _pie!!
        }
        _pie = ImageVector.Builder(
            name = "Pie",
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
        moveTo(20.7578f, 10.1693f)
        curveTo(21.5f, 10.1693f, 22f, 11.1878f, 22f, 12.027f)
        curveTo(22f, 14.3396f, 18.5658f, 14.7345f, 18f, 12.5287f)
        curveTo(17.4968f, 14.4904f, 14.5032f, 14.4904f, 14f, 12.5287f)
        curveTo(13.4968f, 14.4904f, 10.5032f, 14.4904f, 10f, 12.5287f)
        curveTo(9.49677f, 14.4904f, 6.50323f, 14.4904f, 6f, 12.5287f)
        curveTo(5.43417f, 14.7345f, 2f, 14.3396f, 2f, 12.027f)
        curveTo(2f, 11.1878f, 2.5f, 10.1693f, 3.24224f, 10.1693f)
        curveTo(4.18202f, 6.63181f, 7.74641f, 4f, 12f, 4f)
        curveTo(16.2536f, 4f, 19.818f, 6.63181f, 20.7578f, 10.1693f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7.5f)
        lineTo(15.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7.5f)
        lineTo(8.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 14f)
        lineTo(3.94872f, 15.0769f)
        curveTo(4.94302f, 17.4632f, 5.44017f, 18.6564f, 6.44787f, 19.3282f)
        curveTo(7.45556f, 20f, 8.74815f, 20f, 11.3333f, 20f)
        horizontalLineTo(12.6667f)
        curveTo(15.2518f, 20f, 16.5444f, 20f, 17.5521f, 19.3282f)
        curveTo(18.5598f, 18.6564f, 19.057f, 17.4632f, 20.0513f, 15.0769f)
        lineTo(20.5f, 14f)
        }
        }.build()

        return _pie!!
    }

private var _pie: ImageVector? = null
