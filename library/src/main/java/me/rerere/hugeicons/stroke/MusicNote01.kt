package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MusicNote01: ImageVector
    get() {
        if (_musicNote01 != null) {
            return _musicNote01!!
        }
        _musicNote01 = ImageVector.Builder(
            name = "MusicNote01",
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
        moveTo(7f, 9.5f)
        curveTo(7f, 10.8807f, 5.88071f, 12f, 4.5f, 12f)
        curveTo(3.11929f, 12f, 2f, 10.8807f, 2f, 9.5f)
        curveTo(2f, 8.11929f, 3.11929f, 7f, 4.5f, 7f)
        curveTo(5.88071f, 7f, 7f, 8.11929f, 7f, 9.5f)
        moveTo(7f, 9.5f)
        verticalLineTo(2f)
        curveTo(7.33333f, 2.5f, 7.6f, 4.6f, 10f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19.5f)
        lineTo(13f, 11f)
        curveTo(13f, 10.09f, 13f, 9.63502f, 13.2466f, 9.35248f)
        curveTo(13.4932f, 9.06993f, 13.9938f, 9.00163f, 14.9949f, 8.86504f)
        curveTo(18.0085f, 8.45385f, 20.2013f, 7.19797f, 21.3696f, 6.42937f)
        curveTo(21.6498f, 6.24509f, 21.7898f, 6.15295f, 21.8949f, 6.20961f)
        curveTo(22f, 6.26627f, 22f, 6.43179f, 22f, 6.76283f)
        verticalLineTo(17.9259f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 13f)
        curveTo(17.8f, 13f, 21f, 10.6667f, 22f, 10f)
        }
        }.build()

        return _musicNote01!!
    }

private var _musicNote01: ImageVector? = null
