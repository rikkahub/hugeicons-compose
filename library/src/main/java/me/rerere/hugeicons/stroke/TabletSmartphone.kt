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

val HugeIcons.TabletSmartphone: ImageVector
    get() {
        if (_tabletSmartphone != null) {
            return _tabletSmartphone!!
        }
        _tabletSmartphone = ImageVector.Builder(
            name = "TabletSmartphone",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.7487f, 4f)
            curveTo(19.6186f, 3.54062f, 19.4211f, 3.17848f, 19.1213f, 2.87868f)
            curveTo(18.2426f, 2f, 16.8284f, 2f, 14f, 2f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 2f, 4.75736f, 2f, 3.87868f, 2.87868f)
            curveTo(3f, 3.75736f, 3f, 5.17157f, 3f, 8f)
            verticalLineTo(16f)
            curveTo(3f, 18.8284f, 3f, 20.2426f, 3.87868f, 21.1213f)
            curveTo(4.64706f, 21.8897f, 5.82497f, 21.9862f, 8f, 21.9983f)
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
            moveTo(17.1538f, 7f)
            horizontalLineTo(14.8462f)
            curveTo(13.0331f, 7f, 12.1265f, 7f, 11.5633f, 7.54917f)
            curveTo(11f, 8.09835f, 11f, 8.98223f, 11f, 10.75f)
            verticalLineTo(18.25f)
            curveTo(11f, 20.0178f, 11f, 20.9017f, 11.5633f, 21.4508f)
            curveTo(12.1265f, 22f, 13.0331f, 22f, 14.8462f, 22f)
            horizontalLineTo(17.1538f)
            curveTo(18.9669f, 22f, 19.8735f, 22f, 20.4367f, 21.4508f)
            curveTo(21f, 20.9017f, 21f, 20.0178f, 21f, 18.25f)
            verticalLineTo(10.75f)
            curveTo(21f, 8.98223f, 21f, 8.09835f, 20.4367f, 7.54917f)
            curveTo(19.8735f, 7f, 18.9669f, 7f, 17.1538f, 7f)
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
            moveTo(17.5f, 7f)
            horizontalLineTo(14.5f)
            lineTo(14.875f, 8f)
            horizontalLineTo(17.125f)
            lineTo(17.5f, 7f)
            close()
        }
        }.build()

        return _tabletSmartphone!!
    }

private var _tabletSmartphone: ImageVector? = null
