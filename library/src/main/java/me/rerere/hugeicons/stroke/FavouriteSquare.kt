package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FavouriteSquare: ImageVector
    get() {
        if (_favouriteSquare != null) {
            return _favouriteSquare!!
        }
        _favouriteSquare = ImageVector.Builder(
            name = "FavouriteSquare",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.75736f, 2f, 5.63604f, 3.31802f, 4.31802f)
        curveTo(4.63604f, 3f, 6.75736f, 3f, 11f, 3f)
        curveTo(15.2426f, 3f, 17.364f, 3f, 18.682f, 4.31802f)
        curveTo(20f, 5.63604f, 20f, 7.75736f, 20f, 12f)
        curveTo(20f, 16.2426f, 20f, 18.364f, 18.682f, 19.682f)
        curveTo(17.364f, 21f, 15.2426f, 21f, 11f, 21f)
        curveTo(6.75736f, 21f, 4.63604f, 21f, 3.31802f, 19.682f)
        curveTo(2f, 18.364f, 2f, 16.2426f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16.5f)
        curveTo(11f, 16.5f, 6f, 13.3235f, 6f, 10.25f)
        curveTo(6f, 8.73122f, 7.05263f, 7.5f, 8.5f, 7.5f)
        curveTo(9.25f, 7.5f, 10f, 7.76471f, 11f, 8.82353f)
        curveTo(12f, 7.76471f, 12.75f, 7.5f, 13.5f, 7.5f)
        curveTo(14.9474f, 7.5f, 16f, 8.73122f, 16f, 10.25f)
        curveTo(16f, 13.3235f, 11f, 16.5f, 11f, 16.5f)
        }
        }.build()

        return _favouriteSquare!!
    }

private var _favouriteSquare: ImageVector? = null
