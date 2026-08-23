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

val HugeIcons.Construction: ImageVector
    get() {
        if (_construction != null) {
            return _construction!!
        }
        _construction = ImageVector.Builder(
            name = "Construction",
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
            moveTo(18f, 6f)
            horizontalLineTo(6f)
            curveTo(4.59987f, 6f, 3.8998f, 6f, 3.36502f, 6.27248f)
            curveTo(2.89462f, 6.51217f, 2.51217f, 6.89462f, 2.27248f, 7.36502f)
            curveTo(2f, 7.8998f, 2f, 8.59987f, 2f, 10f)
            curveTo(2f, 11.4001f, 2f, 12.1002f, 2.27248f, 12.635f)
            curveTo(2.51217f, 13.1054f, 2.89462f, 13.4878f, 3.36502f, 13.7275f)
            curveTo(3.8998f, 14f, 4.59987f, 14f, 6f, 14f)
            horizontalLineTo(18f)
            curveTo(19.4001f, 14f, 20.1002f, 14f, 20.635f, 13.7275f)
            curveTo(21.1054f, 13.4878f, 21.4878f, 13.1054f, 21.7275f, 12.635f)
            curveTo(22f, 12.1002f, 22f, 11.4001f, 22f, 10f)
            curveTo(22f, 8.59987f, 22f, 7.8998f, 21.7275f, 7.36502f)
            curveTo(21.4878f, 6.89462f, 21.1054f, 6.51217f, 20.635f, 6.27248f)
            curveTo(20.1002f, 6f, 19.4001f, 6f, 18f, 6f)
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
            moveTo(14f, 6f)
            lineTo(21f, 13f)
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
            moveTo(8f, 6f)
            lineTo(16f, 14f)
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
            moveTo(3f, 7f)
            lineTo(10f, 14f)
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
            moveTo(6f, 3f)
            verticalLineTo(6f)
            moveTo(6f, 14f)
            verticalLineTo(21f)
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
            moveTo(18f, 3f)
            verticalLineTo(6f)
            moveTo(18f, 14f)
            verticalLineTo(21f)
        }
        }.build()

        return _construction!!
    }

private var _construction: ImageVector? = null
