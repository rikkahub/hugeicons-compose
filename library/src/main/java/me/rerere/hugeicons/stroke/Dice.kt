package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dice: ImageVector
    get() {
        if (_dice != null) {
            return _dice!!
        }
        _dice = ImageVector.Builder(
            name = "Dice",
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
        moveTo(10.341f, 13.159f)
        curveTo(9.68198f, 12.5f, 8.62132f, 12.5f, 6.5f, 12.5f)
        curveTo(4.37868f, 12.5f, 3.31802f, 12.5f, 2.65901f, 13.159f)
        moveTo(10.341f, 13.159f)
        curveTo(11f, 13.818f, 11f, 14.8787f, 11f, 17f)
        curveTo(11f, 19.1213f, 11f, 20.182f, 10.341f, 20.841f)
        moveTo(10.341f, 13.159f)
        verticalLineTo(13.159f)
        moveTo(2.65901f, 13.159f)
        curveTo(2f, 13.818f, 2f, 14.8787f, 2f, 17f)
        curveTo(2f, 19.1213f, 2f, 20.182f, 2.65901f, 20.841f)
        moveTo(2.65901f, 13.159f)
        verticalLineTo(13.159f)
        moveTo(2.65901f, 20.841f)
        curveTo(3.31802f, 21.5f, 4.37868f, 21.5f, 6.5f, 21.5f)
        curveTo(8.62132f, 21.5f, 9.68198f, 21.5f, 10.341f, 20.841f)
        moveTo(2.65901f, 20.841f)
        verticalLineTo(20.841f)
        moveTo(10.341f, 20.841f)
        verticalLineTo(20.841f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.2218f, 4.77817f)
        curveTo(16.7406f, 6.29696f, 17.5f, 7.05635f, 17.5f, 8f)
        curveTo(17.5f, 8.94365f, 16.7406f, 9.70304f, 15.2218f, 11.2218f)
        curveTo(13.703f, 12.7406f, 12.9436f, 13.5f, 12f, 13.5f)
        curveTo(11.0563f, 13.5f, 10.297f, 12.7406f, 8.77817f, 11.2218f)
        curveTo(7.25939f, 9.70304f, 6.5f, 8.94365f, 6.5f, 8f)
        curveTo(6.5f, 7.05635f, 7.25939f, 6.29696f, 8.77817f, 4.77817f)
        curveTo(10.297f, 3.25939f, 11.0563f, 2.5f, 12f, 2.5f)
        curveTo(12.9437f, 2.5f, 13.703f, 3.25939f, 15.2218f, 4.77817f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.341f, 13.159f)
        curveTo(20.682f, 12.5f, 19.6213f, 12.5f, 17.5f, 12.5f)
        curveTo(15.3787f, 12.5f, 14.318f, 12.5f, 13.659f, 13.159f)
        moveTo(21.341f, 13.159f)
        curveTo(22f, 13.818f, 22f, 14.8787f, 22f, 17f)
        curveTo(22f, 19.1213f, 22f, 20.182f, 21.341f, 20.841f)
        moveTo(21.341f, 13.159f)
        verticalLineTo(13.159f)
        moveTo(13.659f, 13.159f)
        curveTo(13f, 13.818f, 13f, 14.8787f, 13f, 17f)
        curveTo(13f, 19.1213f, 13f, 20.182f, 13.659f, 20.841f)
        moveTo(13.659f, 13.159f)
        verticalLineTo(13.159f)
        moveTo(13.659f, 20.841f)
        curveTo(14.318f, 21.5f, 15.3787f, 21.5f, 17.5f, 21.5f)
        curveTo(19.6213f, 21.5f, 20.682f, 21.5f, 21.341f, 20.841f)
        moveTo(13.659f, 20.841f)
        verticalLineTo(20.841f)
        moveTo(21.341f, 20.841f)
        verticalLineTo(20.841f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0082f, 8f)
        lineTo(11.9992f, 8f)
        }
        }.build()

        return _dice!!
    }

private var _dice: ImageVector? = null
