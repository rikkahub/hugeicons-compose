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

val HugeIcons.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = ImageVector.Builder(
            name = "Hand",
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
            moveTo(18.5f, 11.5f)
            verticalLineTo(8.75f)
            curveTo(18.5f, 7.7835f, 19.2835f, 7f, 20.25f, 7f)
            curveTo(21.2165f, 7f, 22f, 7.7835f, 22f, 8.75f)
            verticalLineTo(14.8f)
            curveTo(22f, 18.7765f, 18.7764f, 22f, 14.8f, 22f)
            horizontalLineTo(12.0588f)
            moveTo(8f, 14f)
            lineTo(5.61507f, 11.2176f)
            curveTo(5.22468f, 10.7621f, 4.65476f, 10.5f, 4.05489f, 10.5f)
            horizontalLineTo(3.91898f)
            curveTo(2.85916f, 10.5f, 2f, 11.3592f, 2f, 12.419f)
            curveTo(2f, 12.7978f, 2.11214f, 13.1682f, 2.32229f, 13.4834f)
            lineTo(5.7812f, 18.6718f)
            curveTo(7.16738f, 20.7511f, 9.50102f, 22f, 12f, 22f)
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
            moveTo(18.5f, 8.5f)
            verticalLineTo(5.75f)
            curveTo(18.5f, 4.7835f, 17.7165f, 4f, 16.75f, 4f)
            curveTo(15.7835f, 4f, 15f, 4.7835f, 15f, 5.75f)
            verticalLineTo(10.5f)
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
            moveTo(15f, 10.5f)
            verticalLineTo(3.75f)
            curveTo(15f, 2.7835f, 14.2165f, 2f, 13.25f, 2f)
            curveTo(12.2835f, 2f, 11.5f, 2.7835f, 11.5f, 3.75f)
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
            moveTo(11.5f, 10f)
            verticalLineTo(5.75f)
            curveTo(11.5f, 4.7835f, 10.7165f, 4f, 9.75f, 4f)
            curveTo(8.7835f, 4f, 8f, 4.7835f, 8f, 5.75f)
            verticalLineTo(14f)
        }
        }.build()

        return _hand!!
    }

private var _hand: ImageVector? = null
