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

val HugeIcons.ParkingMeter: ImageVector
    get() {
        if (_parkingMeter != null) {
            return _parkingMeter!!
        }
        _parkingMeter = ImageVector.Builder(
            name = "ParkingMeter",
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
            moveTo(12f, 2f)
            curveTo(8.13398f, 2f, 4.99997f, 5.13401f, 4.99997f, 9f)
            curveTo(4.99997f, 10.5151f, 5.48133f, 11.9178f, 6.29947f, 13.0635f)
            curveTo(6.55866f, 13.4264f, 6.68827f, 13.608f, 6.73978f, 13.6988f)
            curveTo(6.90985f, 13.9988f, 6.95318f, 14.134f, 6.98909f, 14.4769f)
            curveTo(6.99997f, 14.5808f, 6.99997f, 14.7173f, 6.99997f, 14.9904f)
            curveTo(6.99997f, 15.9293f, 6.99997f, 16.3988f, 7.10416f, 16.7838f)
            curveTo(7.38276f, 17.8131f, 8.18685f, 18.6172f, 9.21621f, 18.8958f)
            curveTo(9.60116f, 19f, 10.0706f, 19f, 11.0096f, 19f)
            horizontalLineTo(12.9903f)
            curveTo(13.9293f, 19f, 14.3988f, 19f, 14.7837f, 18.8958f)
            curveTo(15.8131f, 18.6172f, 16.6172f, 17.8131f, 16.8958f, 16.7838f)
            curveTo(17f, 16.3988f, 17f, 15.9293f, 17f, 14.9904f)
            curveTo(17f, 14.7173f, 17f, 14.5808f, 17.0108f, 14.4769f)
            curveTo(17.0468f, 14.134f, 17.0901f, 13.9988f, 17.2602f, 13.6988f)
            curveTo(17.3117f, 13.6079f, 17.4413f, 13.4265f, 17.7005f, 13.0635f)
            curveTo(18.5186f, 11.9178f, 19f, 10.5151f, 19f, 9f)
            curveTo(19f, 5.13401f, 15.866f, 2f, 12f, 2f)
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
            moveTo(11f, 15f)
            horizontalLineTo(13f)
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
            moveTo(12f, 15f)
            verticalLineTo(12f)
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
            moveTo(12f, 19f)
            verticalLineTo(22f)
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
            moveTo(15f, 9f)
            curveTo(15f, 7.34315f, 13.6569f, 6f, 12f, 6f)
            curveTo(10.3431f, 6f, 9f, 7.34315f, 9f, 9f)
        }
        }.build()

        return _parkingMeter!!
    }

private var _parkingMeter: ImageVector? = null
