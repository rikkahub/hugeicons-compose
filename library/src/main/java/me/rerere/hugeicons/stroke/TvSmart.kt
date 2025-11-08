package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TvSmart: ImageVector
    get() {
        if (_tvSmart != null) {
            return _tvSmart!!
        }
        _tvSmart = ImageVector.Builder(
            name = "TvSmart",
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
        moveTo(14f, 3f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 3f, 4.34315f, 3f, 3.17157f, 4.17157f)
        curveTo(2f, 5.34315f, 2f, 7.22876f, 2f, 11f)
        curveTo(2f, 14.7712f, 2f, 16.6569f, 3.17157f, 17.8284f)
        curveTo(4.34315f, 19f, 6.22876f, 19f, 10f, 19f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 19f, 19.6569f, 19f, 20.8284f, 17.8284f)
        curveTo(22f, 16.6569f, 22f, 14.7712f, 22f, 11f)
        curveTo(22f, 7.22876f, 22f, 5.34315f, 20.8284f, 4.17157f)
        curveTo(19.6569f, 3f, 17.7712f, 3f, 14f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9f, 15.5f)
        curveTo(16.9f, 14.6163f, 17.6163f, 13.9f, 18.5f, 13.9f)
        moveTo(13.7f, 15.5f)
        curveTo(13.7f, 12.849f, 15.849f, 10.7f, 18.5f, 10.7f)
        moveTo(10.5f, 15.5f)
        curveTo(10.5f, 11.0817f, 14.0817f, 7.5f, 18.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 19f)
        lineTo(19f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19f)
        lineTo(5f, 21f)
        }
        }.build()

        return _tvSmart!!
    }

private var _tvSmart: ImageVector? = null
