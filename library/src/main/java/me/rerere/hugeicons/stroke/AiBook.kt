package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiBook: ImageVector
    get() {
        if (_aiBook != null) {
            return _aiBook!!
        }
        _aiBook = ImageVector.Builder(
            name = "AiBook",
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
        moveTo(20.5f, 16.9286f)
        verticalLineTo(10f)
        curveTo(20.5f, 6.22876f, 20.5f, 4.34315f, 19.3284f, 3.17157f)
        curveTo(18.1569f, 2f, 16.2712f, 2f, 12.5f, 2f)
        horizontalLineTo(11.5f)
        curveTo(7.72876f, 2f, 5.84315f, 2f, 4.67157f, 3.17157f)
        curveTo(3.5f, 4.34315f, 3.5f, 6.22876f, 3.5f, 10f)
        verticalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 17f)
        horizontalLineTo(6f)
        curveTo(4.61929f, 17f, 3.5f, 18.1193f, 3.5f, 19.5f)
        curveTo(3.5f, 20.8807f, 4.61929f, 22f, 6f, 22f)
        horizontalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 22f)
        curveTo(19.1193f, 22f, 18f, 20.8807f, 18f, 19.5f)
        curveTo(18f, 18.1193f, 19.1193f, 17f, 20.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.3077f, 12f)
        lineTo(10.847f, 7.47891f)
        curveTo(10.7552f, 7.19466f, 10.4734f, 7f, 10.1538f, 7f)
        curveTo(9.83425f, 7f, 9.55249f, 7.19466f, 9.46066f, 7.47891f)
        lineTo(8f, 12f)
        moveTo(15f, 7f)
        verticalLineTo(12f)
        moveTo(8.53846f, 10.5f)
        horizontalLineTo(11.7692f)
        }
        }.build()

        return _aiBook!!
    }

private var _aiBook: ImageVector? = null
