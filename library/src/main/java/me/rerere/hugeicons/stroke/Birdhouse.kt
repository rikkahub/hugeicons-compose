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

val HugeIcons.Birdhouse: ImageVector
    get() {
        if (_birdhouse != null) {
            return _birdhouse!!
        }
        _birdhouse = ImageVector.Builder(
            name = "Birdhouse",
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
            moveTo(5.00003f, 7.00049f)
            lineTo(7.00003f, 18.0005f)
            moveTo(19f, 7.00049f)
            lineTo(17f, 18.0005f)
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
            moveTo(14f, 9.00049f)
            arcTo(2f, 2f, 0f, true, false, 10f, 9.00049f)
            arcTo(2f, 2f, 0f, true, false, 14f, 9.00049f)
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
            moveTo(12f, 14.3755f)
            verticalLineTo(14.5005f)
            moveTo(12.25f, 14.5005f)
            curveTo(12.25f, 14.6386f, 12.1381f, 14.7505f, 12f, 14.7505f)
            curveTo(11.862f, 14.7505f, 11.75f, 14.6386f, 11.75f, 14.5005f)
            curveTo(11.75f, 14.3624f, 11.862f, 14.2505f, 12f, 14.2505f)
            curveTo(12.1381f, 14.2505f, 12.25f, 14.3624f, 12.25f, 14.5005f)
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
            moveTo(5.00003f, 18.0005f)
            horizontalLineTo(19f)
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
            moveTo(12f, 18.0005f)
            verticalLineTo(22.0005f)
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
            moveTo(3f, 8.00048f)
            lineTo(10.2001f, 2.5998f)
            curveTo(10.7193f, 2.21031f, 11.3509f, 1.99976f, 12f, 1.99976f)
            curveTo(12.6491f, 1.99976f, 13.2807f, 2.21031f, 13.8f, 2.59981f)
            lineTo(21f, 8.00048f)
        }
        }.build()

        return _birdhouse!!
    }

private var _birdhouse: ImageVector? = null
