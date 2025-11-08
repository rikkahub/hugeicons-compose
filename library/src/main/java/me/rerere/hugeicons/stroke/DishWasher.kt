package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DishWasher: ImageVector
    get() {
        if (_dishWasher != null) {
            return _dishWasher!!
        }
        _dishWasher = ImageVector.Builder(
            name = "DishWasher",
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
        moveTo(2f, 6f)
        curveTo(2f, 2.69067f, 2.69067f, 2f, 6f, 2f)
        horizontalLineTo(18f)
        curveTo(21.3093f, 2f, 22f, 2.69067f, 22f, 6f)
        verticalLineTo(18f)
        curveTo(22f, 21.3093f, 21.3093f, 22f, 18f, 22f)
        horizontalLineTo(6f)
        curveTo(2.69067f, 22f, 2f, 21.3093f, 2f, 18f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 5f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5.00895f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 18f)
        curveTo(10.6569f, 18f, 12f, 16.6569f, 12f, 15f)
        curveTo(12f, 13.3431f, 10.6569f, 12f, 9f, 12f)
        curveTo(7.34315f, 12f, 6f, 13.3431f, 6f, 15f)
        curveTo(6f, 16.6569f, 7.34315f, 18f, 9f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0029f, 17.9979f)
        verticalLineTo(15.5535f)
        moveTo(15.0029f, 15.5535f)
        verticalLineTo(11.9937f)
        curveTo(15.6727f, 12.0769f, 16.4389f, 12.3946f, 16.7877f, 12.7372f)
        curveTo(17.1365f, 13.0798f, 17.1462f, 13.5189f, 17.2682f, 14.0652f)
        curveTo(17.3941f, 14.6294f, 17.5152f, 15.1606f, 17.494f, 15.2482f)
        curveTo(17.4679f, 15.8382f, 15.0948f, 15.5575f, 15.0029f, 15.5535f)
        }
        }.build()

        return _dishWasher!!
    }

private var _dishWasher: ImageVector? = null
