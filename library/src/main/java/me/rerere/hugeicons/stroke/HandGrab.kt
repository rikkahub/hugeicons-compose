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

val HugeIcons.HandGrab: ImageVector
    get() {
        if (_handGrab != null) {
            return _handGrab!!
        }
        _handGrab = ImageVector.Builder(
            name = "HandGrab",
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
            moveTo(17.5f, 9.5f)
            verticalLineTo(8.75f)
            curveTo(17.5f, 7.7835f, 18.2835f, 7f, 19.25f, 7f)
            curveTo(20.2165f, 7f, 21f, 7.7835f, 21f, 8.75f)
            verticalLineTo(12.8f)
            curveTo(21f, 16.7765f, 17.7765f, 20f, 13.8f, 20f)
            horizontalLineTo(10.0588f)
            curveTo(6.16034f, 20f, 3f, 16.8397f, 3f, 12.9412f)
            verticalLineTo(12f)
            curveTo(3f, 10.8954f, 3.89543f, 10f, 5f, 10f)
            curveTo(6.10457f, 10f, 7f, 10.8954f, 7f, 12f)
            verticalLineTo(12.9412f)
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
            moveTo(17.5f, 9.5f)
            verticalLineTo(6.75f)
            curveTo(17.5f, 5.7835f, 16.7165f, 5f, 15.75f, 5f)
            curveTo(14.7835f, 5f, 14f, 5.7835f, 14f, 6.75f)
            verticalLineTo(8.5f)
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
            moveTo(14f, 8.5f)
            verticalLineTo(5.75f)
            curveTo(14f, 4.7835f, 13.2165f, 4f, 12.25f, 4f)
            curveTo(11.2835f, 4f, 10.5f, 4.7835f, 10.5f, 5.75f)
            verticalLineTo(8f)
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
            moveTo(10.5f, 8f)
            verticalLineTo(6.75f)
            curveTo(10.5f, 5.7835f, 9.7165f, 5f, 8.75f, 5f)
            curveTo(7.7835f, 5f, 7f, 5.7835f, 7f, 6.75f)
            verticalLineTo(12f)
        }
        }.build()

        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
