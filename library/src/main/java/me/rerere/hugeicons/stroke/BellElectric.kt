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

val HugeIcons.BellElectric: ImageVector
    get() {
        if (_bellElectric != null) {
            return _bellElectric!!
        }
        _bellElectric = ImageVector.Builder(
            name = "BellElectric",
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
            moveTo(22f, 15f)
            arcTo(2f, 2f, 0f, true, false, 18f, 15f)
            arcTo(2f, 2f, 0f, true, false, 22f, 15f)
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
            moveTo(20f, 17f)
            curveTo(19.3333f, 17.6667f, 17.2f, 19f, 14f, 19f)
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
            moveTo(16f, 9f)
            arcTo(7f, 7f, 0f, true, false, 2f, 9f)
            arcTo(7f, 7f, 0f, true, false, 16f, 9f)
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
            moveTo(9f, 8.75f)
            verticalLineTo(9f)
            moveTo(9.5f, 9f)
            curveTo(9.5f, 9.27614f, 9.27614f, 9.5f, 9f, 9.5f)
            curveTo(8.72386f, 9.5f, 8.5f, 9.27614f, 8.5f, 9f)
            curveTo(8.5f, 8.72386f, 8.72386f, 8.5f, 9f, 8.5f)
            curveTo(9.27614f, 8.5f, 9.5f, 8.72386f, 9.5f, 9f)
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
            moveTo(11f, 16f)
            horizontalLineTo(7f)
            curveTo(6.06812f, 16f, 5.60218f, 16f, 5.23463f, 16.1522f)
            curveTo(4.74458f, 16.3552f, 4.35523f, 16.7446f, 4.15224f, 17.2346f)
            curveTo(4f, 17.6022f, 4f, 18.0681f, 4f, 19f)
            curveTo(4f, 19.9319f, 4f, 20.3978f, 4.15224f, 20.7654f)
            curveTo(4.35523f, 21.2554f, 4.74458f, 21.6448f, 5.23463f, 21.8478f)
            curveTo(5.60218f, 22f, 6.06812f, 22f, 7f, 22f)
            horizontalLineTo(11f)
            curveTo(11.9319f, 22f, 12.3978f, 22f, 12.7654f, 21.8478f)
            curveTo(13.2554f, 21.6448f, 13.6448f, 21.2554f, 13.8478f, 20.7654f)
            curveTo(14f, 20.3978f, 14f, 19.9319f, 14f, 19f)
            curveTo(14f, 18.0681f, 14f, 17.6022f, 13.8478f, 17.2346f)
            curveTo(13.6448f, 16.7446f, 13.2554f, 16.3552f, 12.7654f, 16.1522f)
            curveTo(12.3978f, 16f, 11.9319f, 16f, 11f, 16f)
            close()
        }
        }.build()

        return _bellElectric!!
    }

private var _bellElectric: ImageVector? = null
