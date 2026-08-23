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

val HugeIcons.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = ImageVector.Builder(
            name = "Beer",
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
            moveTo(4.5f, 9f)
            verticalLineTo(16f)
            curveTo(4.5f, 18.8284f, 4.5f, 20.2426f, 5.37868f, 21.1213f)
            curveTo(6.25736f, 22f, 7.67157f, 22f, 10.5f, 22f)
            curveTo(13.3284f, 22f, 14.7426f, 22f, 15.6213f, 21.1213f)
            curveTo(16.5f, 20.2426f, 16.5f, 18.8284f, 16.5f, 16f)
            verticalLineTo(9f)
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
            moveTo(16.5f, 10f)
            horizontalLineTo(16.7918f)
            curveTo(18.3954f, 10f, 19.1972f, 10f, 19.7432f, 10.4334f)
            curveTo(19.8631f, 10.5284f, 19.9716f, 10.6369f, 20.0666f, 10.7568f)
            curveTo(20.5f, 11.3028f, 20.5f, 12.1046f, 20.5f, 13.7082f)
            curveTo(20.5f, 14.7332f, 20.5f, 15.2458f, 20.2806f, 15.6747f)
            curveTo(20.2315f, 15.7706f, 20.1748f, 15.8624f, 20.1109f, 15.9492f)
            curveTo(19.8254f, 16.3373f, 19.367f, 16.5665f, 18.4502f, 17.0249f)
            lineTo(16.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.5f, 9f)
            curveTo(11.4684f, 9f, 12.3449f, 8.60674f, 12.9785f, 7.97122f)
            curveTo(13.4331f, 8.59478f, 14.1692f, 9f, 15f, 9f)
            curveTo(16.3807f, 9f, 17.5f, 7.88071f, 17.5f, 6.5f)
            curveTo(17.5f, 5.11929f, 16.3807f, 4f, 15f, 4f)
            curveTo(14.5621f, 4f, 14.1505f, 4.11257f, 13.7926f, 4.31035f)
            curveTo(13.3057f, 2.96298f, 12.0153f, 2f, 10.5f, 2f)
            curveTo(8.98468f, 2f, 7.69428f, 2.96298f, 7.20737f, 4.31035f)
            curveTo(6.84945f, 4.11257f, 6.43787f, 4f, 6f, 4f)
            curveTo(4.61929f, 4f, 3.5f, 5.11929f, 3.5f, 6.5f)
            curveTo(3.5f, 7.88071f, 4.61929f, 9f, 6f, 9f)
            curveTo(6.5628f, 9f, 7.08217f, 8.81403f, 7.5f, 8.50018f)
            verticalLineTo(12f)
            curveTo(7.5f, 12.8284f, 8.17157f, 13.5f, 9f, 13.5f)
            curveTo(9.82843f, 13.5f, 10.5f, 12.8284f, 10.5f, 12f)
            verticalLineTo(9f)
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
            moveTo(12.5f, 14.5f)
            verticalLineTo(19f)
            moveTo(8.5f, 16.5f)
            verticalLineTo(19f)
        }
        }.build()

        return _beer!!
    }

private var _beer: ImageVector? = null
