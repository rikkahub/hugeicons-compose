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

val HugeIcons.TravelBag: ImageVector
    get() {
        if (_travelBag != null) {
            return _travelBag!!
        }
        _travelBag = ImageVector.Builder(
            name = "TravelBag",
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
            moveTo(16f, 6.5f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 6.5f, 3.75736f, 6.5f, 2.87868f, 7.37868f)
            curveTo(2f, 8.25736f, 2f, 9.67157f, 2f, 12.5f)
            verticalLineTo(15f)
            curveTo(2f, 17.8284f, 2f, 19.2426f, 2.87868f, 20.1213f)
            curveTo(3.75736f, 21f, 5.17157f, 21f, 8f, 21f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 21f, 20.2426f, 21f, 21.1213f, 20.1213f)
            curveTo(22f, 19.2426f, 22f, 17.8284f, 22f, 15f)
            verticalLineTo(12.5f)
            curveTo(22f, 9.67157f, 22f, 8.25736f, 21.1213f, 7.37868f)
            curveTo(20.2426f, 6.5f, 18.8284f, 6.5f, 16f, 6.5f)
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
            moveTo(7.5f, 6.5f)
            verticalLineTo(11f)
            moveTo(7.5f, 21f)
            verticalLineTo(15f)
            moveTo(16.5f, 6.5f)
            verticalLineTo(21f)
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
            moveTo(9f, 11f)
            horizontalLineTo(6f)
            curveTo(5.44772f, 11f, 5f, 11.4477f, 5f, 12f)
            verticalLineTo(14f)
            curveTo(5f, 14.5523f, 5.44772f, 15f, 6f, 15f)
            horizontalLineTo(9f)
            curveTo(9.55228f, 15f, 10f, 14.5523f, 10f, 14f)
            verticalLineTo(12f)
            curveTo(10f, 11.4477f, 9.55228f, 11f, 9f, 11f)
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
            moveTo(8.5f, 6.5f)
            curveTo(8.5f, 5.09554f, 8.5f, 4.39331f, 8.83706f, 3.88886f)
            curveTo(8.98298f, 3.67048f, 9.17048f, 3.48298f, 9.38886f, 3.33706f)
            curveTo(9.89331f, 3f, 10.5955f, 3f, 12f, 3f)
            curveTo(13.4045f, 3f, 14.1067f, 3f, 14.6111f, 3.33706f)
            curveTo(14.8295f, 3.48298f, 15.017f, 3.67048f, 15.1629f, 3.88886f)
            curveTo(15.5f, 4.39331f, 15.5f, 5.09554f, 15.5f, 6.5f)
        }
        }.build()

        return _travelBag!!
    }

private var _travelBag: ImageVector? = null
