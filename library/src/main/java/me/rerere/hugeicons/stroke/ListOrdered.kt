package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ListOrdered: ImageVector
    get() {
        if (_listOrdered != null) {
            return _listOrdered!!
        }
        _listOrdered = ImageVector.Builder(
            name = "ListOrdered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.9961f, 6f)
            lineTo(20.9961f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.9961f, 12f)
            lineTo(20.9961f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.9961f, 18f)
            lineTo(20.9961f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.99609f, 15f)
            horizontalLineTo(4.49609f)
            curveTo(4.77489f, 15f, 4.91428f, 15f, 5.0302f, 15.0231f)
            curveTo(5.50623f, 15.1177f, 5.87835f, 15.4899f, 5.97304f, 15.9659f)
            curveTo(5.99609f, 16.0818f, 5.99609f, 16.2212f, 5.99609f, 16.5f)
            curveTo(5.99609f, 16.7788f, 5.99609f, 16.9182f, 5.97304f, 17.0341f)
            curveTo(5.87835f, 17.5101f, 5.50623f, 17.8823f, 5.0302f, 17.9769f)
            curveTo(4.91428f, 18f, 4.77489f, 18f, 4.49609f, 18f)
            curveTo(4.2173f, 18f, 4.0779f, 18f, 3.96199f, 18.0231f)
            curveTo(3.48596f, 18.1177f, 3.11384f, 18.4899f, 3.01915f, 18.9659f)
            curveTo(2.99609f, 19.0818f, 2.99609f, 19.2212f, 2.99609f, 19.5f)
            verticalLineTo(20.4f)
            curveTo(2.99609f, 20.6828f, 2.99609f, 20.8243f, 3.08396f, 20.9121f)
            curveTo(3.17183f, 21f, 3.31325f, 21f, 3.59609f, 21f)
            horizontalLineTo(5.99609f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.99609f, 9f)
            horizontalLineTo(4.49609f)
            moveTo(4.49609f, 9f)
            horizontalLineTo(5.99609f)
            moveTo(4.49609f, 9f)
            verticalLineTo(4f)
            curveTo(4.49609f, 3.5286f, 4.49609f, 3.29289f, 4.34965f, 3.14645f)
            curveTo(4.2032f, 3f, 3.9675f, 3f, 3.49609f, 3f)
            horizontalLineTo(2.99609f)
        }
        }.build()

        return _listOrdered!!
    }

private var _listOrdered: ImageVector? = null
