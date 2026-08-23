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

val HugeIcons.IdCard: ImageVector
    get() {
        if (_idCard != null) {
            return _idCard!!
        }
        _idCard = ImageVector.Builder(
            name = "IdCard",
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
            moveTo(16f, 9f)
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
            moveTo(16f, 13f)
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
            moveTo(4.99806f, 16.6018f)
            curveTo(5.28942f, 15.7247f, 5.83071f, 14.9651f, 6.5472f, 14.4277f)
            curveTo(7.26369f, 13.8904f, 8.12005f, 13.6018f, 8.99806f, 13.6018f)
            curveTo(9.87606f, 13.6018f, 10.7324f, 13.8904f, 11.4489f, 14.4277f)
            curveTo(12.1654f, 14.9651f, 12.7067f, 15.7247f, 12.9981f, 16.6018f)
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
            moveTo(8.94922f, 11.3984f)
            curveTo(10.0538f, 11.3984f, 10.9492f, 10.503f, 10.9492f, 9.39844f)
            curveTo(10.9492f, 8.29387f, 10.0538f, 7.39844f, 8.94922f, 7.39844f)
            curveTo(7.84465f, 7.39844f, 6.94922f, 8.29387f, 6.94922f, 9.39844f)
            curveTo(6.94922f, 10.503f, 7.84465f, 11.3984f, 8.94922f, 11.3984f)
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
            moveTo(15f, 4f)
            horizontalLineTo(9f)
            curveTo(5.70017f, 4f, 4.05025f, 4f, 3.02513f, 5.02513f)
            curveTo(2f, 6.05025f, 2f, 7.70017f, 2f, 11f)
            verticalLineTo(13f)
            curveTo(2f, 16.2998f, 2f, 17.9497f, 3.02513f, 18.9749f)
            curveTo(4.05025f, 20f, 5.70017f, 20f, 9f, 20f)
            horizontalLineTo(15f)
            curveTo(18.2998f, 20f, 19.9497f, 20f, 20.9749f, 18.9749f)
            curveTo(22f, 17.9497f, 22f, 16.2998f, 22f, 13f)
            verticalLineTo(11f)
            curveTo(22f, 7.70017f, 22f, 6.05025f, 20.9749f, 5.02513f)
            curveTo(19.9497f, 4f, 18.2998f, 4f, 15f, 4f)
            close()
        }
        }.build()

        return _idCard!!
    }

private var _idCard: ImageVector? = null
