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

val HugeIcons.ShareLocation01: ImageVector
    get() {
        if (_shareLocation01 != null) {
            return _shareLocation01!!
        }
        _shareLocation01 = ImageVector.Builder(
            name = "ShareLocation01",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.7185f, 16.2151f)
            curveTo(12.5258f, 16.3979f, 12.2682f, 16.5f, 12.0001f, 16.5f)
            curveTo(11.732f, 16.5f, 11.4744f, 16.3979f, 11.2817f, 16.2151f)
            curveTo(9.51674f, 14.5317f, 7.15154f, 12.6511f, 8.30498f, 9.92085f)
            curveTo(8.92863f, 8.44462f, 10.4257f, 7.5f, 12.0001f, 7.5f)
            curveTo(13.5745f, 7.5f, 15.0715f, 8.44462f, 15.6952f, 9.92085f)
            curveTo(16.8472f, 12.6477f, 14.4878f, 14.5375f, 12.7185f, 16.2151f)
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
            moveTo(10f, 21.8f)
            curveTo(10.6462f, 21.9311f, 11.3151f, 22f, 12f, 22f)
            curveTo(17.5237f, 22f, 22f, 17.5222f, 22f, 12f)
            curveTo(22f, 6.47778f, 17.5237f, 2f, 12f, 2f)
            curveTo(11.3151f, 2f, 10.6462f, 2.06886f, 10f, 2.20004f)
            moveTo(2.20004f, 14f)
            curveTo(2.06886f, 13.3538f, 2f, 12.6849f, 2f, 12f)
            curveTo(2f, 11.3151f, 2.06886f, 10.6462f, 2.20004f, 10f)
            moveTo(6.5f, 20.353f)
            curveTo(5.36678f, 19.6053f, 4.39469f, 18.6332f, 3.64702f, 17.5f)
            moveTo(3.64702f, 6.5f)
            curveTo(4.39469f, 5.36678f, 5.36678f, 4.39469f, 6.5f, 3.64702f)
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
            moveTo(12.1348f, 11.5f)
            horizontalLineTo(12.0098f)
            moveTo(12.2598f, 11.5f)
            curveTo(12.2598f, 11.6381f, 12.1478f, 11.75f, 12.0098f, 11.75f)
            curveTo(11.8717f, 11.75f, 11.7598f, 11.6381f, 11.7598f, 11.5f)
            curveTo(11.7598f, 11.3619f, 11.8717f, 11.25f, 12.0098f, 11.25f)
            curveTo(12.1478f, 11.25f, 12.2598f, 11.3619f, 12.2598f, 11.5f)
            close()
        }
        }.build()

        return _shareLocation01!!
    }

private var _shareLocation01: ImageVector? = null
