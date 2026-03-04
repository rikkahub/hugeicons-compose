package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GraphicCard: ImageVector
    get() {
        if (_graphicCard != null) {
            return _graphicCard!!
        }
        _graphicCard = ImageVector.Builder(
            name = "GraphicCard",
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
        moveTo(4f, 17f)
        verticalLineTo(5f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 5f, 20.2426f, 5f, 21.1213f, 5.87868f)
        curveTo(22f, 6.75736f, 22f, 8.17157f, 22f, 11f)
        curveTo(22f, 13.8284f, 22f, 15.2426f, 21.1213f, 16.1213f)
        curveTo(20.2426f, 17f, 18.8284f, 17f, 16f, 17f)
        horizontalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        verticalLineTo(18.5f)
        curveTo(8f, 18.9659f, 8f, 19.1989f, 8.07612f, 19.3827f)
        curveTo(8.17761f, 19.6277f, 8.37229f, 19.8224f, 8.61732f, 19.9239f)
        curveTo(8.80109f, 20f, 9.03406f, 20f, 9.5f, 20f)
        curveTo(9.96594f, 20f, 10.1989f, 20f, 10.3827f, 19.9239f)
        curveTo(10.6277f, 19.8224f, 10.8224f, 19.6277f, 10.9239f, 19.3827f)
        curveTo(11f, 19.1989f, 11f, 18.9659f, 11f, 18.5f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        verticalLineTo(18f)
        curveTo(14f, 18.9428f, 14f, 19.4142f, 14.2929f, 19.7071f)
        curveTo(14.5858f, 20f, 15.0572f, 20f, 16f, 20f)
        horizontalLineTo(17f)
        curveTo(17.9428f, 20f, 18.4142f, 20f, 18.7071f, 19.7071f)
        curveTo(19f, 19.4142f, 19f, 18.9428f, 19f, 18f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        verticalLineTo(5f)
        curveTo(4f, 3.89543f, 3.10457f, 3f, 2f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        curveTo(16.6569f, 14f, 18f, 12.6569f, 18f, 11f)
        curveTo(18f, 9.34315f, 16.6569f, 8f, 15f, 8f)
        curveTo(13.3431f, 8f, 12f, 9.34315f, 12f, 11f)
        curveTo(12f, 12.6569f, 13.3431f, 14f, 15f, 14f)
        }
        }.build()

        return _graphicCard!!
    }

private var _graphicCard: ImageVector? = null
