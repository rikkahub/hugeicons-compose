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

val HugeIcons.EarOff: ImageVector
    get() {
        if (_earOff != null) {
            return _earOff!!
        }
        _earOff = ImageVector.Builder(
            name = "EarOff",
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
            moveTo(6.07692f, 18f)
            curveTo(6.07692f, 20.2091f, 7.226f, 22f, 9.30769f, 22f)
            curveTo(11.3894f, 22f, 13.0769f, 20.5f, 13.6154f, 18f)
            curveTo(13.8736f, 16.8013f, 14.4026f, 16.0767f, 15.2308f, 15.5f)
            curveTo(15.2836f, 15.4632f, 15.3361f, 15.426f, 15.3882f, 15.3882f)
            moveTo(5f, 9f)
            curveTo(5f, 7.83973f, 5.28229f, 6.7454f, 5.78193f, 5.78193f)
            moveTo(8.15176f, 3.15176f)
            curveTo(9.25593f, 2.42372f, 10.5785f, 2f, 12f, 2f)
            curveTo(15.866f, 2f, 19f, 5.13401f, 19f, 9f)
            curveTo(19f, 10.4031f, 18.5612f, 11.7018f, 17.8361f, 12.8361f)
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
            moveTo(9f, 15f)
            curveTo(10.385f, 15f, 11.5078f, 13.9926f, 11.5078f, 12.75f)
            curveTo(11.5078f, 11.5074f, 10.385f, 10.5f, 9f, 10.5f)
            curveTo(9f, 10.0426f, 9.02385f, 9.56132f, 9.09042f, 9.09042f)
            moveTo(15f, 9f)
            curveTo(14.8496f, 7.22416f, 13.7998f, 6f, 12.0094f, 6f)
            curveTo(11.6787f, 6f, 11.3832f, 6.0419f, 11.1192f, 6.11923f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _earOff!!
    }

private var _earOff: ImageVector? = null
