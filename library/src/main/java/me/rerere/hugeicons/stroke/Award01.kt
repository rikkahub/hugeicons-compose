package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Award01: ImageVector
    get() {
        if (_award01 != null) {
            return _award01!!
        }
        _award01 = ImageVector.Builder(
            name = "Award01",
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
        moveTo(12f, 12f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        curveTo(10.3264f, 18f, 8.86971f, 19.012f, 8.11766f, 20.505f)
        curveTo(7.75846f, 21.218f, 8.27389f, 22f, 8.95877f, 22f)
        horizontalLineTo(15.0412f)
        curveTo(15.7261f, 22f, 16.2415f, 21.218f, 15.8823f, 20.505f)
        curveTo(15.1303f, 19.012f, 13.6736f, 18f, 12f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 5f)
        horizontalLineTo(3.98471f)
        curveTo(2.99819f, 5f, 2.50493f, 5f, 2.20017f, 5.37053f)
        curveTo(1.89541f, 5.74106f, 1.98478f, 6.15597f, 2.16352f, 6.9858f)
        curveTo(2.50494f, 8.57086f, 3.24548f, 9.9634f, 4.2489f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        horizontalLineTo(20.0153f)
        curveTo(21.0018f, 5f, 21.4951f, 5f, 21.7998f, 5.37053f)
        curveTo(22.1046f, 5.74106f, 22.0152f, 6.15597f, 21.8365f, 6.9858f)
        curveTo(21.4951f, 8.57086f, 20.7545f, 9.9634f, 19.7511f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        curveTo(15.866f, 12f, 19f, 8.8831f, 19f, 5.03821f)
        curveTo(19f, 4.93739f, 18.9978f, 4.83707f, 18.9936f, 4.73729f)
        curveTo(18.9509f, 3.73806f, 18.9295f, 3.23845f, 18.2523f, 2.61922f)
        curveTo(17.5751f, 2f, 16.8247f, 2f, 15.324f, 2f)
        horizontalLineTo(8.67596f)
        curveTo(7.17526f, 2f, 6.42492f, 2f, 5.74772f, 2.61922f)
        curveTo(5.07051f, 3.23844f, 5.04915f, 3.73806f, 5.00642f, 4.73729f)
        curveTo(5.00215f, 4.83707f, 5f, 4.93739f, 5f, 5.03821f)
        curveTo(5f, 8.8831f, 8.13401f, 12f, 12f, 12f)
        }
        }.build()

        return _award01!!
    }

private var _award01: ImageVector? = null
