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

val HugeIcons.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = ImageVector.Builder(
            name = "List",
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
            moveTo(9.12109f, 5f)
            horizontalLineTo(21.1211f)
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
            moveTo(9.12109f, 12f)
            horizontalLineTo(21.1211f)
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
            moveTo(9.12109f, 19f)
            horizontalLineTo(21.1211f)
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
            moveTo(3.24609f, 5f)
            horizontalLineTo(3.12109f)
            moveTo(3.37109f, 5f)
            curveTo(3.37109f, 5.13807f, 3.25916f, 5.25f, 3.12109f, 5.25f)
            curveTo(2.98302f, 5.25f, 2.87109f, 5.13807f, 2.87109f, 5f)
            curveTo(2.87109f, 4.86193f, 2.98302f, 4.75f, 3.12109f, 4.75f)
            curveTo(3.25916f, 4.75f, 3.37109f, 4.86193f, 3.37109f, 5f)
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
            moveTo(3.24609f, 12f)
            horizontalLineTo(3.12109f)
            moveTo(3.37109f, 12f)
            curveTo(3.37109f, 12.1381f, 3.25916f, 12.25f, 3.12109f, 12.25f)
            curveTo(2.98302f, 12.25f, 2.87109f, 12.1381f, 2.87109f, 12f)
            curveTo(2.87109f, 11.8619f, 2.98302f, 11.75f, 3.12109f, 11.75f)
            curveTo(3.25916f, 11.75f, 3.37109f, 11.8619f, 3.37109f, 12f)
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
            moveTo(3.24609f, 19f)
            horizontalLineTo(3.12109f)
            moveTo(3.37109f, 19f)
            curveTo(3.37109f, 19.1381f, 3.25916f, 19.25f, 3.12109f, 19.25f)
            curveTo(2.98302f, 19.25f, 2.87109f, 19.1381f, 2.87109f, 19f)
            curveTo(2.87109f, 18.8619f, 2.98302f, 18.75f, 3.12109f, 18.75f)
            curveTo(3.25916f, 18.75f, 3.37109f, 18.8619f, 3.37109f, 19f)
            close()
        }
        }.build()

        return _list!!
    }

private var _list: ImageVector? = null
