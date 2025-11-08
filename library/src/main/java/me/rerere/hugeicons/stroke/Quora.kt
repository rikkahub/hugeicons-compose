package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = ImageVector.Builder(
            name = "Quora",
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
        moveTo(17.1481f, 22.0001f)
        curveTo(20.037f, 22.0001f, 21f, 19.6776f, 21f, 16.8126f)
        curveTo(20.037f, 17.8497f, 17.3671f, 20.0195f, 16.1852f, 15.775f)
        curveTo(14.7407f, 10.5876f, 10.5f, 11.5f, 8f, 14f)
        curveTo(11.8519f, 14f, 12.3827f, 14.8974f, 13.2963f, 17.8501f)
        curveTo(14.2593f, 20.9625f, 15.7037f, 22.0001f, 17.1481f, 22.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5154f, 11f)
        curveTo(6.5052f, 10.8351f, 6.5f, 10.6684f, 6.5f, 10.5f)
        curveTo(6.5f, 7.18629f, 8.51472f, 4.5f, 11f, 4.5f)
        curveTo(13.4853f, 4.5f, 15.5f, 7.18629f, 15.5f, 10.5f)
        curveTo(15.5f, 11.3922f, 15.262f, 12.2389f, 15f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2413f, 18.6619f)
        curveTo(12.5301f, 18.882f, 11.778f, 19f, 11f, 19f)
        curveTo(6.58172f, 19f, 3f, 15.1944f, 3f, 10.5f)
        curveTo(3f, 5.80558f, 6.58172f, 2f, 11f, 2f)
        curveTo(15.4183f, 2f, 19f, 5.80558f, 19f, 10.5f)
        curveTo(19f, 11.7477f, 18.747f, 12.9326f, 18.2925f, 14f)
        }
        }.build()

        return _quora!!
    }

private var _quora: ImageVector? = null
