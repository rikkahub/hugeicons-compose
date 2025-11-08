package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BedSingle01: ImageVector
    get() {
        if (_bedSingle01 != null) {
            return _bedSingle01!!
        }
        _bedSingle01 = ImageVector.Builder(
            name = "BedSingle01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17.5f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 21f)
        verticalLineTo(16f)
        curveTo(22f, 14.1144f, 22f, 13.1716f, 21.4142f, 12.5858f)
        curveTo(20.8284f, 12f, 19.8856f, 12f, 18f, 12f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 12f, 3.17157f, 12f, 2.58579f, 12.5858f)
        curveTo(2f, 13.1716f, 2f, 14.1144f, 2f, 16f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        verticalLineTo(10.6178f)
        curveTo(16f, 10.1103f, 15.9085f, 9.94054f, 15.4396f, 9.7405f)
        curveTo(14.4631f, 9.32389f, 13.2778f, 9f, 12f, 9f)
        curveTo(10.7222f, 9f, 9.53688f, 9.32389f, 8.5604f, 9.7405f)
        curveTo(8.09154f, 9.94054f, 8f, 10.1103f, 8f, 10.6178f)
        lineTo(8f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12f)
        verticalLineTo(7.36057f)
        curveTo(20f, 6.66893f, 20f, 6.32311f, 19.8292f, 5.99653f)
        curveTo(19.6584f, 5.66995f, 19.4151f, 5.50091f, 18.9284f, 5.16283f)
        curveTo(16.9661f, 3.79978f, 14.5772f, 3f, 12f, 3f)
        curveTo(9.42282f, 3f, 7.03391f, 3.79978f, 5.07163f, 5.16283f)
        curveTo(4.58492f, 5.50091f, 4.34157f, 5.66995f, 4.17079f, 5.99653f)
        curveTo(4f, 6.32311f, 4f, 6.66893f, 4f, 7.36057f)
        verticalLineTo(12f)
        }
        }.build()

        return _bedSingle01!!
    }

private var _bedSingle01: ImageVector? = null
