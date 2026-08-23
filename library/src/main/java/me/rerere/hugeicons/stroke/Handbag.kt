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

val HugeIcons.Handbag: ImageVector
    get() {
        if (_handbag != null) {
            return _handbag!!
        }
        _handbag = ImageVector.Builder(
            name = "Handbag",
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
            moveTo(8.16174f, 9f)
            horizontalLineTo(15.8383f)
            curveTo(17.3041f, 9f, 18.037f, 9f, 18.5705f, 9.38371f)
            curveTo(18.6503f, 9.44108f, 18.7257f, 9.50413f, 18.7962f, 9.57235f)
            curveTo(19.2675f, 10.0286f, 19.388f, 10.742f, 19.6289f, 12.1688f)
            curveTo(20.2809f, 16.029f, 20.6069f, 17.9591f, 19.6518f, 19.3001f)
            curveTo(19.5116f, 19.497f, 19.3536f, 19.681f, 19.1799f, 19.8499f)
            curveTo(17.9964f, 21f, 15.9976f, 21f, 12f, 21f)
            curveTo(8.00237f, 21f, 6.00355f, 21f, 4.82015f, 19.8499f)
            curveTo(4.64639f, 19.681f, 4.48842f, 19.497f, 4.34818f, 19.3001f)
            curveTo(3.39307f, 17.9591f, 3.71906f, 16.029f, 4.37106f, 12.1688f)
            curveTo(4.61204f, 10.742f, 4.73253f, 10.0286f, 5.20379f, 9.57235f)
            curveTo(5.27426f, 9.50413f, 5.34968f, 9.44108f, 5.42946f, 9.38371f)
            curveTo(5.963f, 9f, 6.69592f, 9f, 8.16174f, 9f)
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
            moveTo(5.5f, 9.5f)
            lineTo(6.40128f, 11.4828f)
            curveTo(7.17759f, 13.1907f, 7.56575f, 14.0446f, 8.30758f, 14.5223f)
            curveTo(9.04942f, 15f, 9.98744f, 15f, 11.8635f, 15f)
            horizontalLineTo(12.1365f)
            curveTo(14.0126f, 15f, 14.9506f, 15f, 15.6924f, 14.5223f)
            curveTo(16.4343f, 14.0446f, 16.8224f, 13.1907f, 17.5987f, 11.4828f)
            lineTo(18.5f, 9.5f)
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
            moveTo(8f, 9f)
            verticalLineTo(7f)
            curveTo(8f, 4.79086f, 9.79086f, 3f, 12f, 3f)
            curveTo(14.2091f, 3f, 16f, 4.79086f, 16f, 7f)
            verticalLineTo(9f)
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
            moveTo(12f, 14f)
            verticalLineTo(16f)
        }
        }.build()

        return _handbag!!
    }

private var _handbag: ImageVector? = null
