package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddToList: ImageVector
    get() {
        if (_addToList != null) {
            return _addToList!!
        }
        _addToList = ImageVector.Builder(
            name = "AddToList",
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
        moveTo(3.5f, 9f)
        verticalLineTo(14f)
        curveTo(3.5f, 17.7712f, 3.5f, 19.6569f, 4.67157f, 20.8284f)
        curveTo(5.84315f, 22f, 7.72876f, 22f, 11.5f, 22f)
        horizontalLineTo(12.5f)
        curveTo(16.2712f, 22f, 18.1569f, 22f, 19.3284f, 20.8284f)
        curveTo(20.5f, 19.6569f, 20.5f, 17.7712f, 20.5f, 14f)
        verticalLineTo(10f)
        curveTo(20.5f, 6.22876f, 20.5f, 4.34315f, 19.3284f, 3.17157f)
        curveTo(18.1569f, 2f, 16.2712f, 2f, 12.5f, 2f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 17f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 7f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 12f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 16.5f)
        curveTo(6.5f, 16.5f, 7.46758f, 16.7672f, 8f, 18f)
        curveTo(8f, 18f, 9f, 15f, 11f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5f)
        horizontalLineTo(3.5f)
        moveTo(10f, 5f)
        curveTo(10f, 4.15973f, 7.67332f, 2.58984f, 7.08333f, 2f)
        moveTo(10f, 5f)
        curveTo(10f, 5.84027f, 7.67331f, 7.41016f, 7.08333f, 8f)
        }
        }.build()

        return _addToList!!
    }

private var _addToList: ImageVector? = null
