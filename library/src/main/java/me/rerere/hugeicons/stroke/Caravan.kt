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

val HugeIcons.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = ImageVector.Builder(
            name = "Caravan",
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
            moveTo(19.1f, 18f)
            horizontalLineTo(20.5f)
            curveTo(20.9659f, 18f, 21.1989f, 18f, 21.3827f, 17.9239f)
            curveTo(21.6277f, 17.8224f, 21.8224f, 17.6277f, 21.9239f, 17.3827f)
            curveTo(22f, 17.1989f, 22f, 16.9659f, 22f, 16.5f)
            moveTo(19.1f, 18f)
            verticalLineTo(11.3955f)
            curveTo(19.1f, 9.32395f, 18.7412f, 8.25904f, 17.3783f, 6.71082f)
            curveTo(15.5455f, 4.62893f, 14.3713f, 4f, 11.5699f, 4f)
            horizontalLineTo(6.22222f)
            curveTo(4.23185f, 4f, 3.23666f, 4f, 2.61833f, 4.68342f)
            curveTo(2f, 5.36683f, 2f, 6.46678f, 2f, 8.66667f)
            verticalLineTo(13.3333f)
            curveTo(2f, 15.5332f, 2f, 16.6332f, 2.61833f, 17.3166f)
            curveTo(3.23666f, 18f, 4.23185f, 18f, 6.22222f, 18f)
            horizontalLineTo(7f)
            moveTo(19.1f, 18f)
            horizontalLineTo(11f)
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
            moveTo(11f, 18f)
            arcTo(2f, 2f, 0f, true, false, 7f, 18f)
            arcTo(2f, 2f, 0f, true, false, 11f, 18f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 9.5f)
            curveTo(5f, 8.32149f, 5f, 7.73223f, 5.34171f, 7.36612f)
            curveTo(5.68342f, 7f, 6.23339f, 7f, 7.33333f, 7f)
            horizontalLineTo(9.66667f)
            curveTo(10.7666f, 7f, 11.3166f, 7f, 11.6583f, 7.36612f)
            curveTo(12f, 7.73223f, 12f, 8.32149f, 12f, 9.5f)
            curveTo(12f, 10.6785f, 12f, 11.2678f, 11.6583f, 11.6339f)
            curveTo(11.3166f, 12f, 10.7666f, 12f, 9.66667f, 12f)
            horizontalLineTo(7.33333f)
            curveTo(6.23339f, 12f, 5.68342f, 12f, 5.34171f, 11.6339f)
            curveTo(5f, 11.2678f, 5f, 10.6785f, 5f, 9.5f)
            close()
        }
        }.build()

        return _caravan!!
    }

private var _caravan: ImageVector? = null
