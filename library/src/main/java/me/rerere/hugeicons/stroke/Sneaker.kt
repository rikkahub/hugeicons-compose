package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sneaker: ImageVector
    get() {
        if (_sneaker != null) {
            return _sneaker!!
        }
        _sneaker = ImageVector.Builder(
            name = "Sneaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.5f, 15f)
            verticalLineTo(11f)
            curveTo(1.5f, 8.3572f, 2.27604f, 7.0078f, 2.80267f, 6.26817f)
            curveTo(2.92438f, 6.09724f, 3.1235f, 6f, 3.33333f, 6f)
            curveTo(3.70152f, 6f, 3.99247f, 6.3018f, 4.07177f, 6.66135f)
            curveTo(4.2683f, 7.55235f, 4.91032f, 8.5f, 6.5f, 8.5f)
            curveTo(8.22121f, 8.5f, 9.07834f, 6.89528f, 9.70879f, 5.59803f)
            curveTo(9.88707f, 5.23117f, 10.2577f, 5f, 10.6655f, 5f)
            curveTo(10.8834f, 5f, 11.0961f, 5.06607f, 11.2756f, 5.18948f)
            lineTo(19f, 10.5f)
            curveTo(22f, 11.5f, 22.5f, 13f, 22.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19f, 10.5f)
            curveTo(19f, 11f, 18.5f, 12f, 17f, 12.1429f)
            curveTo(15.009f, 12.3325f, 14f, 14f, 14f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.5f, 13f)
            verticalLineTo(15f)
            curveTo(1.5f, 16.4142f, 1.5f, 17.1213f, 1.93934f, 17.5607f)
            curveTo(2.37868f, 18f, 3.08579f, 18f, 4.5f, 18f)
            horizontalLineTo(19.5f)
            curveTo(20.9142f, 18f, 21.6213f, 18f, 22.0607f, 17.5607f)
            curveTo(22.5f, 17.1213f, 22.5f, 16.4142f, 22.5f, 15f)
            horizontalLineTo(8.74264f)
            curveTo(7.94699f, 15f, 7.18393f, 14.6839f, 6.62132f, 14.1213f)
            lineTo(6.37868f, 13.8787f)
            curveTo(5.81607f, 13.3161f, 5.05301f, 13f, 4.25736f, 13f)
            horizontalLineTo(1.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.396f, 6.70409f)
            lineTo(12.1541f, 8.26457f)
            moveTo(15.5001f, 8.5002f)
            lineTo(14.5589f, 9.8023f)
        }
        }.build()

        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
