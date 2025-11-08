package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.City03: ImageVector
    get() {
        if (_city03 != null) {
            return _city03!!
        }
        _city03 = ImageVector.Builder(
            name = "City03",
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
        moveTo(13f, 16.7033f)
        curveTo(13f, 15.7854f, 13f, 15.3265f, 13.2034f, 14.9292f)
        curveTo(13.4067f, 14.5319f, 13.7859f, 14.2501f, 14.5442f, 13.6866f)
        lineTo(15.0442f, 13.315f)
        curveTo(16.2239f, 12.4383f, 16.8138f, 12f, 17.5f, 12f)
        curveTo(18.1862f, 12f, 18.7761f, 12.4383f, 19.9558f, 13.315f)
        lineTo(20.4558f, 13.6866f)
        curveTo(21.2141f, 14.2501f, 21.5933f, 14.5319f, 21.7966f, 14.9292f)
        curveTo(22f, 15.3265f, 22f, 15.7854f, 22f, 16.7033f)
        verticalLineTo(18.1782f)
        curveTo(22f, 19.9798f, 22f, 20.8806f, 21.4142f, 21.4403f)
        curveTo(20.8284f, 22f, 19.8856f, 22f, 18f, 22f)
        horizontalLineTo(13f)
        verticalLineTo(16.7033f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12.0002f)
        verticalLineTo(5f)
        curveTo(18f, 2.518f, 17.482f, 2f, 15f, 2f)
        horizontalLineTo(11f)
        curveTo(8.518f, 2f, 8f, 2.518f, 8f, 5f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 16f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        horizontalLineTo(14f)
        moveTo(12f, 9f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 22f)
        lineTo(17.5f, 20f)
        }
        }.build()

        return _city03!!
    }

private var _city03: ImageVector? = null
