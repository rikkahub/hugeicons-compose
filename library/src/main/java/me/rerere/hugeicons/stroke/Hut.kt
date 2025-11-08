package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hut: ImageVector
    get() {
        if (_hut != null) {
            return _hut!!
        }
        _hut = ImageVector.Builder(
            name = "Hut",
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
        moveTo(6f, 12f)
        horizontalLineTo(18f)
        lineTo(20f, 22f)
        horizontalLineTo(4f)
        lineTo(6f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 22f)
        lineTo(9.67845f, 18.7008f)
        curveTo(9.83237f, 17.9522f, 9.90934f, 17.578f, 10.1858f, 17.3575f)
        curveTo(10.7623f, 16.8979f, 13.1953f, 16.8641f, 13.8142f, 17.3575f)
        curveTo(14.0907f, 17.578f, 14.1676f, 17.9522f, 14.3216f, 18.7008f)
        lineTo(15f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3.2f)
        lineTo(5.54446f, 8.43826f)
        curveTo(3.71745f, 9.92076f, 2.80395f, 10.662f, 3.03531f, 11.331f)
        curveTo(3.26667f, 12f, 4.43653f, 12f, 6.77624f, 12f)
        horizontalLineTo(17.2238f)
        curveTo(19.5635f, 12f, 20.7333f, 12f, 20.9647f, 11.331f)
        curveTo(21.1961f, 10.662f, 20.2826f, 9.92076f, 18.4555f, 8.43826f)
        lineTo(12f, 3.2f)
        moveTo(12f, 3.2f)
        lineTo(13.4789f, 2f)
        moveTo(12f, 3.2f)
        lineTo(10.5211f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        lineTo(12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 12f)
        lineTo(8f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        lineTo(16f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }
        }.build()

        return _hut!!
    }

private var _hut: ImageVector? = null
