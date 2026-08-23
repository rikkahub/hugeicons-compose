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

val HugeIcons.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = ImageVector.Builder(
            name = "Chart",
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
            moveTo(15f, 21f)
            verticalLineTo(6f)
            curveTo(15f, 5.06812f, 15f, 4.60218f, 14.8478f, 4.23463f)
            curveTo(14.6448f, 3.74458f, 14.2554f, 3.35523f, 13.7654f, 3.15224f)
            curveTo(13.3978f, 3f, 12.9319f, 3f, 12f, 3f)
            curveTo(11.0681f, 3f, 10.6022f, 3f, 10.2346f, 3.15224f)
            curveTo(9.74458f, 3.35523f, 9.35523f, 3.74458f, 9.15224f, 4.23463f)
            curveTo(9f, 4.60218f, 9f, 5.06812f, 9f, 6f)
            verticalLineTo(21f)
            horizontalLineTo(15f)
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
            moveTo(17f, 8f)
            horizontalLineTo(15f)
            verticalLineTo(21f)
            horizontalLineTo(17f)
            curveTo(18.8856f, 21f, 19.8284f, 21f, 20.4142f, 20.4142f)
            curveTo(21f, 19.8284f, 21f, 18.8856f, 21f, 17f)
            verticalLineTo(12f)
            curveTo(21f, 10.1144f, 21f, 9.17157f, 20.4142f, 8.58579f)
            curveTo(19.8284f, 8f, 18.8856f, 8f, 17f, 8f)
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
            moveTo(9f, 13f)
            horizontalLineTo(7f)
            curveTo(5.11438f, 13f, 4.17157f, 13f, 3.58579f, 13.5858f)
            curveTo(3f, 14.1716f, 3f, 15.1144f, 3f, 17f)
            curveTo(3f, 18.8856f, 3f, 19.8284f, 3.58579f, 20.4142f)
            curveTo(4.17157f, 21f, 5.11438f, 21f, 7f, 21f)
            horizontalLineTo(9f)
            verticalLineTo(13f)
            close()
        }
        }.build()

        return _chart!!
    }

private var _chart: ImageVector? = null
