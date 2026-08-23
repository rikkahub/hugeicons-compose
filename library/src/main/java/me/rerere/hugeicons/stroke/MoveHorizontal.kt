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

val HugeIcons.MoveHorizontal: ImageVector
    get() {
        if (_moveHorizontal != null) {
            return _moveHorizontal!!
        }
        _moveHorizontal = ImageVector.Builder(
            name = "MoveHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.4922f, 12.75f)
            curveTo(20.9064f, 12.75f, 21.2422f, 12.4142f, 21.2422f, 12f)
            curveTo(21.2422f, 11.5858f, 20.9064f, 11.25f, 20.4922f, 11.25f)
            verticalLineTo(12f)
            verticalLineTo(12.75f)
            close()
            moveTo(3.49219f, 11.25f)
            curveTo(3.07797f, 11.25f, 2.74219f, 11.5858f, 2.74219f, 12f)
            curveTo(2.74219f, 12.4142f, 3.07797f, 12.75f, 3.49219f, 12.75f)
            verticalLineTo(12f)
            verticalLineTo(11.25f)
            close()
            moveTo(20.4922f, 12f)
            verticalLineTo(11.25f)
            horizontalLineTo(3.49219f)
            verticalLineTo(12f)
            verticalLineTo(12.75f)
            horizontalLineTo(20.4922f)
            verticalLineTo(12f)
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
            moveTo(6.99219f, 16f)
            curveTo(6.18308f, 15.2136f, 2.99216f, 13.1203f, 2.99219f, 12f)
            curveTo(2.99221f, 10.8797f, 6.18306f, 8.78644f, 6.99218f, 8f)
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
            moveTo(16.9922f, 16f)
            curveTo(17.8013f, 15.2136f, 20.9922f, 13.1203f, 20.9922f, 12f)
            curveTo(20.9922f, 10.8797f, 17.8013f, 8.78644f, 16.9922f, 8f)
        }
        }.build()

        return _moveHorizontal!!
    }

private var _moveHorizontal: ImageVector? = null
