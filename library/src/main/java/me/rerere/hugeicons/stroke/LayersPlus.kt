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

val HugeIcons.LayersPlus: ImageVector
    get() {
        if (_layersPlus != null) {
            return _layersPlus!!
        }
        _layersPlus = ImageVector.Builder(
            name = "LayersPlus",
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
            moveTo(17.4961f, 14f)
            verticalLineTo(22f)
            moveTo(21.4961f, 18f)
            horizontalLineTo(13.4961f)
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
            moveTo(8.13908f, 3.14559f)
            lineTo(6.43426f, 3.93362f)
            curveTo(3.80881f, 5.14719f, 2.49609f, 5.75397f, 2.49609f, 6.75f)
            curveTo(2.49609f, 7.74603f, 3.80882f, 8.35281f, 6.43426f, 9.56638f)
            lineTo(8.13908f, 10.3544f)
            curveTo(9.79133f, 11.1181f, 10.6175f, 11.5f, 11.4961f, 11.5f)
            curveTo(12.3747f, 11.5f, 13.2009f, 11.1181f, 14.8531f, 10.3544f)
            lineTo(16.5579f, 9.56638f)
            curveTo(19.1834f, 8.35281f, 20.4961f, 7.74603f, 20.4961f, 6.75f)
            curveTo(20.4961f, 5.75397f, 19.1834f, 5.14719f, 16.5579f, 3.93362f)
            lineTo(14.8531f, 3.14559f)
            curveTo(13.2009f, 2.38186f, 12.3747f, 2f, 11.4961f, 2f)
            curveTo(10.6175f, 2f, 9.79133f, 2.38186f, 8.13908f, 3.14559f)
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
            moveTo(2.70809f, 11.0977f)
            curveTo(2.56676f, 11.2964f, 2.49609f, 11.5036f, 2.49609f, 11.7314f)
            curveTo(2.49609f, 12.7132f, 3.80882f, 13.3114f, 6.43426f, 14.5077f)
            lineTo(8.13908f, 15.2845f)
            curveTo(8.66591f, 15.5245f, 9.10876f, 15.7263f, 9.49609f, 15.8898f)
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
            moveTo(12.4961f, 21.8444f)
            curveTo(12.1402f, 21.9478f, 11.8217f, 21.9995f, 11.4961f, 21.9995f)
            curveTo(10.6175f, 21.9995f, 9.79133f, 21.6231f, 8.13908f, 20.8702f)
            lineTo(6.43426f, 20.0934f)
            curveTo(3.80882f, 18.8971f, 2.49609f, 18.299f, 2.49609f, 17.3171f)
            curveTo(2.49609f, 16.9265f, 2.70387f, 16.5966f, 3.11943f, 16.2656f)
        }
        }.build()

        return _layersPlus!!
    }

private var _layersPlus: ImageVector? = null
