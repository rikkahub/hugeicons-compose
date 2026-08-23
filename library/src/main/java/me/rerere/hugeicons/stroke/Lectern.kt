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

val HugeIcons.Lectern: ImageVector
    get() {
        if (_lectern != null) {
            return _lectern!!
        }
        _lectern = ImageVector.Builder(
            name = "Lectern",
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
            moveTo(8.50719f, 22.0001f)
            lineTo(7.87018f, 14.3323f)
            curveTo(7.70178f, 12.3052f, 7.61758f, 11.2917f, 8.20994f, 10.6459f)
            curveTo(8.80231f, 10.0001f, 9.81621f, 10.0001f, 11.844f, 10.0001f)
            horizontalLineTo(12.1487f)
            curveTo(14.1765f, 10.0001f, 15.1904f, 10.0001f, 15.7827f, 10.6459f)
            curveTo(16.3751f, 11.2917f, 16.2909f, 12.3052f, 16.1225f, 14.3323f)
            lineTo(15.4855f, 22.0001f)
            horizontalLineTo(8.50719f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.99634f, 22.0001f)
            horizontalLineTo(17.9963f)
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
            moveTo(7.52516f, 13.0001f)
            curveTo(6.58284f, 13.0001f, 6.11168f, 13.0001f, 5.72131f, 12.8225f)
            curveTo(5.45276f, 12.7002f, 5.21459f, 12.5194f, 5.02405f, 12.2931f)
            curveTo(4.74707f, 11.9642f, 4.61764f, 11.5082f, 4.35876f, 10.5963f)
            lineTo(4.32053f, 10.4616f)
            curveTo(3.82716f, 8.72373f, 3.58048f, 7.85477f, 3.87003f, 7.19354f)
            curveTo(3.99408f, 6.91027f, 4.18176f, 6.65984f, 4.41831f, 6.46198f)
            curveTo(4.97048f, 6.00012f, 5.86843f, 6.00012f, 7.66431f, 6.00012f)
            horizontalLineTo(16.3284f)
            curveTo(18.1243f, 6.00012f, 19.0222f, 6.00012f, 19.5744f, 6.46198f)
            curveTo(19.8109f, 6.65984f, 19.9986f, 6.91027f, 20.1226f, 7.19354f)
            curveTo(20.4122f, 7.85477f, 20.1655f, 8.72373f, 19.6721f, 10.4616f)
            lineTo(19.6339f, 10.5963f)
            curveTo(19.375f, 11.5082f, 19.2456f, 11.9642f, 18.9686f, 12.2931f)
            curveTo(18.7781f, 12.5194f, 18.5399f, 12.7002f, 18.2714f, 12.8225f)
            curveTo(17.881f, 13.0001f, 17.4098f, 13.0001f, 16.4675f, 13.0001f)
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
            moveTo(6.99634f, 6.00012f)
            verticalLineTo(4.00012f)
            curveTo(6.99634f, 2.89555f, 7.89177f, 2.00012f, 8.99634f, 2.00012f)
            horizontalLineTo(9.99634f)
        }
        }.build()

        return _lectern!!
    }

private var _lectern: ImageVector? = null
