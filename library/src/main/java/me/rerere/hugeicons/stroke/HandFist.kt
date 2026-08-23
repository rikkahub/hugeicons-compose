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

val HugeIcons.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = ImageVector.Builder(
            name = "HandFist",
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
            moveTo(21f, 5.5f)
            verticalLineTo(9f)
            curveTo(21f, 10.1046f, 20.1046f, 11f, 19f, 11f)
            curveTo(17.8954f, 11f, 17f, 10.1046f, 17f, 9f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.39543f, 17.8954f, 3.5f, 19f, 3.5f)
            curveTo(20.1046f, 3.5f, 21f, 4.39543f, 21f, 5.5f)
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
            moveTo(17f, 4f)
            verticalLineTo(9.5f)
            curveTo(17f, 10.6046f, 16.1046f, 11.5f, 15f, 11.5f)
            curveTo(13.8954f, 11.5f, 13f, 10.6046f, 13f, 9.5f)
            verticalLineTo(4f)
            curveTo(13f, 2.89543f, 13.8954f, 2f, 15f, 2f)
            curveTo(16.1046f, 2f, 17f, 2.89543f, 17f, 4f)
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
            moveTo(9f, 7.5f)
            verticalLineTo(4f)
            curveTo(9f, 2.89543f, 9.89543f, 2f, 11f, 2f)
            curveTo(12.1046f, 2f, 13f, 2.89543f, 13f, 4f)
            verticalLineTo(9.5f)
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
            moveTo(5f, 8f)
            verticalLineTo(4.5f)
            curveTo(5f, 3.39543f, 5.89543f, 2.5f, 7f, 2.5f)
            curveTo(8.10457f, 2.5f, 9f, 3.39543f, 9f, 4.5f)
            verticalLineTo(7f)
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
            moveTo(12f, 17f)
            verticalLineTo(16f)
            curveTo(12f, 13.7909f, 10.2091f, 12f, 8f, 12f)
            horizontalLineTo(11f)
            curveTo(12.1046f, 12f, 13f, 11.1046f, 13f, 10f)
            curveTo(13f, 8.89543f, 12.1046f, 8f, 11f, 8f)
            horizontalLineTo(7.2f)
            curveTo(6.08323f, 8f, 5.52485f, 8f, 5.07295f, 8.14683f)
            curveTo(4.15964f, 8.44358f, 3.44358f, 9.15964f, 3.14683f, 10.0729f)
            curveTo(3f, 10.5248f, 3f, 11.0832f, 3f, 12.2f)
            verticalLineTo(13f)
            curveTo(3f, 14.8591f, 3f, 15.7887f, 3.1755f, 16.5576f)
            curveTo(3.77384f, 19.1791f, 5.82088f, 21.2262f, 8.44235f, 21.8245f)
            curveTo(9.21129f, 22f, 10.1409f, 22f, 12f, 22f)
            curveTo(13.8591f, 22f, 14.7887f, 22f, 15.5576f, 21.8245f)
            curveTo(18.1791f, 21.2262f, 20.2262f, 19.1791f, 20.8245f, 16.5576f)
            curveTo(21f, 15.7887f, 21f, 14.8591f, 21f, 13f)
            verticalLineTo(9f)
        }
        }.build()

        return _handFist!!
    }

private var _handFist: ImageVector? = null
