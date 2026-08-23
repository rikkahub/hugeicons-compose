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

val HugeIcons.TableOfContents: ImageVector
    get() {
        if (_tableOfContents != null) {
            return _tableOfContents!!
        }
        _tableOfContents = ImageVector.Builder(
            name = "TableOfContents",
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
            moveTo(3.87891f, 5f)
            lineTo(15.8789f, 5f)
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
            moveTo(3.87891f, 12f)
            lineTo(15.8789f, 12f)
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
            moveTo(3.87891f, 19f)
            lineTo(15.8789f, 19f)
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
            moveTo(20.0039f, 5f)
            horizontalLineTo(19.8789f)
            moveTo(20.1289f, 5f)
            curveTo(20.1289f, 5.13807f, 20.017f, 5.25f, 19.8789f, 5.25f)
            curveTo(19.7408f, 5.25f, 19.6289f, 5.13807f, 19.6289f, 5f)
            curveTo(19.6289f, 4.86193f, 19.7408f, 4.75f, 19.8789f, 4.75f)
            curveTo(20.017f, 4.75f, 20.1289f, 4.86193f, 20.1289f, 5f)
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
            moveTo(20.0039f, 12f)
            horizontalLineTo(19.8789f)
            moveTo(20.1289f, 12f)
            curveTo(20.1289f, 12.1381f, 20.017f, 12.25f, 19.8789f, 12.25f)
            curveTo(19.7408f, 12.25f, 19.6289f, 12.1381f, 19.6289f, 12f)
            curveTo(19.6289f, 11.8619f, 19.7408f, 11.75f, 19.8789f, 11.75f)
            curveTo(20.017f, 11.75f, 20.1289f, 11.8619f, 20.1289f, 12f)
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
            moveTo(20.0039f, 19f)
            horizontalLineTo(19.8789f)
            moveTo(20.1289f, 19f)
            curveTo(20.1289f, 19.1381f, 20.017f, 19.25f, 19.8789f, 19.25f)
            curveTo(19.7408f, 19.25f, 19.6289f, 19.1381f, 19.6289f, 19f)
            curveTo(19.6289f, 18.8619f, 19.7408f, 18.75f, 19.8789f, 18.75f)
            curveTo(20.017f, 18.75f, 20.1289f, 18.8619f, 20.1289f, 19f)
            close()
        }
        }.build()

        return _tableOfContents!!
    }

private var _tableOfContents: ImageVector? = null
