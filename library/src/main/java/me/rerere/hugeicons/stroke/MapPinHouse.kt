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

val HugeIcons.MapPinHouse: ImageVector
    get() {
        if (_mapPinHouse != null) {
            return _mapPinHouse!!
        }
        _mapPinHouse = ImageVector.Builder(
            name = "MapPinHouse",
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
            moveTo(13f, 10f)
            curveTo(13f, 11.6569f, 11.6569f, 13f, 10f, 13f)
            curveTo(8.34315f, 13f, 7f, 11.6569f, 7f, 10f)
            curveTo(7f, 8.34315f, 8.34315f, 7f, 10f, 7f)
            curveTo(11.6569f, 7f, 13f, 8.34315f, 13f, 10f)
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
            moveTo(21.3547f, 16.4469f)
            lineTo(18.8796f, 14.3254f)
            curveTo(18.6347f, 14.1154f, 18.3226f, 14f, 18f, 14f)
            curveTo(17.6774f, 14f, 17.3653f, 14.1154f, 17.1204f, 14.3254f)
            lineTo(14.6453f, 16.4469f)
            curveTo(14.2357f, 16.7979f, 14f, 17.3105f, 14f, 17.8499f)
            verticalLineTo(18.5752f)
            curveTo(14f, 19.9081f, 14f, 20.5746f, 14.305f, 21.0616f)
            curveTo(14.4655f, 21.3179f, 14.6821f, 21.5345f, 14.9384f, 21.695f)
            curveTo(15.4254f, 22f, 16.0919f, 22f, 17.4248f, 22f)
            horizontalLineTo(18.5752f)
            curveTo(19.9081f, 22f, 20.5746f, 22f, 21.0616f, 21.695f)
            curveTo(21.3179f, 21.5345f, 21.5345f, 21.3179f, 21.695f, 21.0616f)
            curveTo(22f, 20.5746f, 22f, 19.9081f, 22f, 18.5752f)
            verticalLineTo(17.8499f)
            curveTo(22f, 17.3105f, 21.7643f, 16.7979f, 21.3547f, 16.4469f)
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
            moveTo(18f, 19f)
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
            moveTo(18f, 10.0355f)
            curveTo(18f, 5.59762f, 14.4183f, 2f, 10f, 2f)
            curveTo(5.58172f, 2f, 2f, 5.59762f, 2f, 10.0355f)
            curveTo(2f, 12.5731f, 3f, 14.5462f, 5f, 16.3086f)
            curveTo(6.07535f, 17.2562f, 7.82291f, 19.0316f, 9.04653f, 20.5628f)
            curveTo(9.27943f, 20.8543f, 9.63972f, 21f, 10f, 21f)
        }
        }.build()

        return _mapPinHouse!!
    }

private var _mapPinHouse: ImageVector? = null
