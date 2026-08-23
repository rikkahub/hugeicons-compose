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

val HugeIcons.PowerSocket01: ImageVector
    get() {
        if (_powerSocket01 != null) {
            return _powerSocket01!!
        }
        _powerSocket01 = ImageVector.Builder(
            name = "PowerSocket01",
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
            moveTo(2.5f, 12f)
            curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
            curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
            curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
            curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
            curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
            curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
            curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
            curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
            curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
            curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
            curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
            curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
            close()
        }

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
            moveTo(18f, 12f)
            arcTo(6f, 6f, 0f, true, false, 6f, 12f)
            arcTo(6f, 6f, 0f, true, false, 18f, 12f)
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
            moveTo(9.875f, 12f)
            horizontalLineTo(9.75f)
            moveTo(14.375f, 12.0014f)
            horizontalLineTo(14.25f)
            moveTo(10f, 12f)
            curveTo(10f, 12.1381f, 9.88807f, 12.25f, 9.75f, 12.25f)
            curveTo(9.61193f, 12.25f, 9.5f, 12.1381f, 9.5f, 12f)
            curveTo(9.5f, 11.8619f, 9.61193f, 11.75f, 9.75f, 11.75f)
            curveTo(9.88807f, 11.75f, 10f, 11.8619f, 10f, 12f)
            close()
            moveTo(14.5f, 12.0014f)
            curveTo(14.5f, 12.1395f, 14.3881f, 12.2514f, 14.25f, 12.2514f)
            curveTo(14.1119f, 12.2514f, 14f, 12.1395f, 14f, 12.0014f)
            curveTo(14f, 11.8634f, 14.1119f, 11.7514f, 14.25f, 11.7514f)
            curveTo(14.3881f, 11.7514f, 14.5f, 11.8634f, 14.5f, 12.0014f)
            close()
        }
        }.build()

        return _powerSocket01!!
    }

private var _powerSocket01: ImageVector? = null
