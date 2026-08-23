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

val HugeIcons.HandMetal: ImageVector
    get() {
        if (_handMetal != null) {
            return _handMetal!!
        }
        _handMetal = ImageVector.Builder(
            name = "HandMetal",
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
            moveTo(3.5f, 11f)
            verticalLineTo(5.25f)
            curveTo(3.5f, 4.2835f, 4.2835f, 3.5f, 5.25f, 3.5f)
            curveTo(6.2165f, 3.5f, 7f, 4.2835f, 7f, 5.25f)
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
            moveTo(7f, 12.5f)
            verticalLineTo(9.75f)
            curveTo(7f, 8.7835f, 7.7835f, 8f, 8.75f, 8f)
            curveTo(9.7165f, 8f, 10.5f, 8.7835f, 10.5f, 9.75f)
            verticalLineTo(12.5f)
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
            moveTo(10.5f, 12.5f)
            verticalLineTo(9.75f)
            curveTo(10.5f, 8.7835f, 11.2835f, 8f, 12.25f, 8f)
            curveTo(13.2165f, 8f, 14f, 8.7835f, 14f, 9.75f)
            verticalLineTo(12.5f)
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
            moveTo(17.5f, 15f)
            verticalLineTo(3.75f)
            curveTo(17.5f, 2.7835f, 16.7165f, 2f, 15.75f, 2f)
            curveTo(14.7835f, 2f, 14f, 2.7835f, 14f, 3.75f)
            verticalLineTo(10f)
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
            moveTo(3.5f, 8f)
            verticalLineTo(13.5f)
            curveTo(3.5f, 14.8936f, 3.5f, 15.5904f, 3.5989f, 16.1725f)
            curveTo(4.0972f, 19.1053f, 6.39469f, 21.4028f, 9.32746f, 21.9011f)
            curveTo(9.90956f, 22f, 10.6231f, 22f, 12.0503f, 22f)
            curveTo(13.384f, 22f, 14.0509f, 22f, 14.595f, 21.9138f)
            curveTo(17.5903f, 21.4394f, 19.9394f, 19.0903f, 20.4138f, 16.095f)
            curveTo(20.5f, 15.5509f, 20.5f, 14.9006f, 20.5f, 13.6f)
            verticalLineTo(12.5f)
            curveTo(20.5f, 11.1193f, 19.3807f, 10f, 18f, 10f)
        }
        }.build()

        return _handMetal!!
    }

private var _handMetal: ImageVector? = null
