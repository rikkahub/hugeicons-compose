package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiScheduling: ImageVector
    get() {
        if (_aiScheduling != null) {
            return _aiScheduling!!
        }
        _aiScheduling = ImageVector.Builder(
            name = "AiScheduling",
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
        moveTo(18f, 2f)
        verticalLineTo(5f)
        moveTo(6f, 2f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 3.5f)
        horizontalLineTo(13.5f)
        curveTo(17.2712f, 3.5f, 19.1569f, 3.5f, 20.3284f, 4.67157f)
        curveTo(21.5f, 5.84315f, 21.5f, 7.72876f, 21.5f, 11.5f)
        verticalLineTo(14f)
        curveTo(21.5f, 17.7712f, 21.5f, 19.6569f, 20.3284f, 20.8284f)
        curveTo(19.1569f, 22f, 17.2712f, 22f, 13.5f, 22f)
        horizontalLineTo(10.5f)
        curveTo(6.72876f, 22f, 4.84315f, 22f, 3.67157f, 20.8284f)
        curveTo(2.5f, 19.6569f, 2.5f, 17.7712f, 2.5f, 14f)
        verticalLineTo(11.5f)
        curveTo(2.5f, 7.72876f, 2.5f, 5.84315f, 3.67157f, 4.67157f)
        curveTo(4.84315f, 3.5f, 6.72876f, 3.5f, 10.5f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.44356f, 14.5282f)
        curveTo(10.0526f, 14.3279f, 11.3279f, 13.0526f, 11.5282f, 11.4436f)
        curveTo(11.5585f, 11.2f, 11.7545f, 11f, 12f, 11f)
        curveTo(12.2455f, 11f, 12.4415f, 11.2f, 12.4718f, 11.4436f)
        curveTo(12.6721f, 13.0526f, 13.9474f, 14.3279f, 15.5564f, 14.5282f)
        curveTo(15.8f, 14.5585f, 16f, 14.7545f, 16f, 15f)
        curveTo(16f, 15.2455f, 15.8f, 15.4415f, 15.5564f, 15.4718f)
        curveTo(13.9474f, 15.6721f, 12.6721f, 16.9474f, 12.4718f, 18.5564f)
        curveTo(12.4415f, 18.8f, 12.2455f, 19f, 12f, 19f)
        curveTo(11.7545f, 19f, 11.5585f, 18.8f, 11.5282f, 18.5564f)
        curveTo(11.3279f, 16.9474f, 10.0526f, 15.6721f, 8.44356f, 15.4718f)
        curveTo(8.19998f, 15.4415f, 8f, 15.2455f, 8f, 15f)
        curveTo(8f, 14.7545f, 8.19998f, 14.5585f, 8.44356f, 14.5282f)
        }
        }.build()

        return _aiScheduling!!
    }

private var _aiScheduling: ImageVector? = null
