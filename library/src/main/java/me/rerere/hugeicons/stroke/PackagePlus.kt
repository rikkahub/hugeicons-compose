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

val HugeIcons.PackagePlus: ImageVector
    get() {
        if (_packagePlus != null) {
            return _packagePlus!!
        }
        _packagePlus = ImageVector.Builder(
            name = "PackagePlus",
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
            moveTo(10.9922f, 22f)
            curveTo(10.174f, 22f, 9.39238f, 21.6698f, 7.82911f, 21.0095f)
            curveTo(3.93783f, 19.3657f, 1.99219f, 18.5438f, 1.99219f, 17.1613f)
            curveTo(1.99219f, 16.7742f, 1.99219f, 10.0645f, 1.99219f, 7f)
            moveTo(10.9922f, 22f)
            lineTo(10.9922f, 11.3548f)
            moveTo(10.9922f, 22f)
            curveTo(11.717f, 22f, 12.2851f, 21.7409f, 13.4922f, 21.2226f)
            moveTo(19.9922f, 7f)
            verticalLineTo(11f)
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
            moveTo(14.9922f, 17.5f)
            horizontalLineTo(21.9922f)
            moveTo(18.4922f, 21f)
            lineTo(18.4922f, 14f)
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
            moveTo(7.31811f, 9.69138f)
            lineTo(4.3969f, 8.27785f)
            curveTo(2.79376f, 7.5021f, 1.99219f, 7.11423f, 1.99219f, 6.5f)
            curveTo(1.99219f, 5.88577f, 2.79376f, 5.4979f, 4.3969f, 4.72215f)
            lineTo(7.31811f, 3.30862f)
            curveTo(9.12102f, 2.43621f, 10.0225f, 2f, 10.9922f, 2f)
            curveTo(11.9619f, 2f, 12.8634f, 2.4362f, 14.6663f, 3.30862f)
            lineTo(17.5875f, 4.72215f)
            curveTo(19.1906f, 5.4979f, 19.9922f, 5.88577f, 19.9922f, 6.5f)
            curveTo(19.9922f, 7.11423f, 19.1906f, 7.5021f, 17.5875f, 8.27785f)
            lineTo(14.6663f, 9.69138f)
            curveTo(12.8634f, 10.5638f, 11.9619f, 11f, 10.9922f, 11f)
            curveTo(10.0225f, 11f, 9.12102f, 10.5638f, 7.31811f, 9.69138f)
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
            moveTo(4.99219f, 12f)
            lineTo(6.99219f, 13f)
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
            moveTo(15.9922f, 4f)
            lineTo(5.99219f, 9f)
        }
        }.build()

        return _packagePlus!!
    }

private var _packagePlus: ImageVector? = null
