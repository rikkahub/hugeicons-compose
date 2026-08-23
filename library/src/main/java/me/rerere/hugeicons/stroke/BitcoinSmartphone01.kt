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

val HugeIcons.BitcoinSmartphone01: ImageVector
    get() {
        if (_bitcoinSmartphone01 != null) {
            return _bitcoinSmartphone01!!
        }
        _bitcoinSmartphone01 = ImageVector.Builder(
            name = "BitcoinSmartphone01",
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
            moveTo(11.125f, 19f)
            horizontalLineTo(11f)
            moveTo(11.25f, 19f)
            curveTo(11.25f, 19.1381f, 11.1381f, 19.25f, 11f, 19.25f)
            curveTo(10.8619f, 19.25f, 10.75f, 19.1381f, 10.75f, 19f)
            curveTo(10.75f, 18.8619f, 10.8619f, 18.75f, 11f, 18.75f)
            curveTo(11.1381f, 18.75f, 11.25f, 18.8619f, 11.25f, 19f)
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
            moveTo(18f, 15f)
            curveTo(18f, 18.2998f, 18f, 19.9497f, 16.9749f, 20.9749f)
            curveTo(15.9497f, 22f, 14.2998f, 22f, 11f, 22f)
            curveTo(7.70017f, 22f, 6.05025f, 22f, 5.02513f, 20.9749f)
            curveTo(4f, 19.9497f, 4f, 18.2998f, 4f, 15f)
            verticalLineTo(9f)
            curveTo(4f, 5.70017f, 4f, 4.05025f, 5.02513f, 3.02513f)
            curveTo(6.05025f, 2f, 7.70017f, 2f, 11f, 2f)
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
            moveTo(15f, 3.5f)
            horizontalLineTo(18f)
            curveTo(18.8284f, 3.5f, 19.5f, 4.17157f, 19.5f, 5f)
            verticalLineTo(5.5f)
            curveTo(19.5f, 6.32843f, 18.8284f, 7f, 18f, 7f)
            horizontalLineTo(15f)
            moveTo(15f, 3.5f)
            verticalLineTo(7f)
            moveTo(15f, 3.5f)
            horizontalLineTo(14f)
            moveTo(15f, 7f)
            horizontalLineTo(18.5f)
            curveTo(19.3284f, 7f, 20f, 7.67157f, 20f, 8.5f)
            verticalLineTo(9f)
            curveTo(20f, 9.82843f, 19.3284f, 10.5f, 18.5f, 10.5f)
            horizontalLineTo(15f)
            moveTo(15f, 7f)
            verticalLineTo(10.5f)
            moveTo(17f, 3.5f)
            verticalLineTo(2f)
            moveTo(17f, 10.5f)
            verticalLineTo(12f)
            moveTo(15f, 10.5f)
            horizontalLineTo(14f)
        }
        }.build()

        return _bitcoinSmartphone01!!
    }

private var _bitcoinSmartphone01: ImageVector? = null
