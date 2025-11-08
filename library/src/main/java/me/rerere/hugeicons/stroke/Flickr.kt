package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flickr: ImageVector
    get() {
        if (_flickr != null) {
            return _flickr!!
        }
        _flickr = ImageVector.Builder(
            name = "Flickr",
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
        moveTo(10.5f, 12f)
        curveTo(10.5f, 13.3807f, 9.38071f, 14.5f, 8f, 14.5f)
        curveTo(6.61929f, 14.5f, 5.5f, 13.3807f, 5.5f, 12f)
        curveTo(5.5f, 10.6193f, 6.61929f, 9.5f, 8f, 9.5f)
        curveTo(9.38071f, 9.5f, 10.5f, 10.6193f, 10.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 12f)
        curveTo(18.5f, 13.3807f, 17.3807f, 14.5f, 16f, 14.5f)
        curveTo(14.6193f, 14.5f, 13.5f, 13.3807f, 13.5f, 12f)
        curveTo(13.5f, 10.6193f, 14.6193f, 9.5f, 16f, 9.5f)
        curveTo(17.3807f, 9.5f, 18.5f, 10.6193f, 18.5f, 12f)
        }
        }.build()

        return _flickr!!
    }

private var _flickr: ImageVector? = null
