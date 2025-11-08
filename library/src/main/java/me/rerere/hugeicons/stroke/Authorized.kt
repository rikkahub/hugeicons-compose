package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Authorized: ImageVector
    get() {
        if (_authorized != null) {
            return _authorized!!
        }
        _authorized = ImageVector.Builder(
            name = "Authorized",
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
        moveTo(4f, 17f)
        curveTo(4f, 19.2091f, 5.75326f, 21f, 7.91602f, 21f)
        curveTo(9.68999f, 21f, 11.1885f, 19.7951f, 11.6699f, 18.1429f)
        horizontalLineTo(15.8599f)
        curveTo(16.2819f, 18.1429f, 16.3075f, 18.169f, 16.3075f, 18.6f)
        verticalLineTo(19.8571f)
        curveTo(16.3075f, 20.3959f, 16.3075f, 20.6653f, 16.4713f, 20.8326f)
        curveTo(16.6352f, 21f, 16.8989f, 21f, 17.4263f, 21f)
        horizontalLineTo(18.1874f)
        curveTo(18.6265f, 21f, 18.846f, 21f, 19.0007f, 20.8705f)
        curveTo(19.1554f, 20.741f, 19.1984f, 20.5211f, 19.2845f, 20.0813f)
        lineTo(19.2845f, 20.0813f)
        lineTo(19.5921f, 18.5103f)
        curveTo(19.661f, 18.1585f, 19.6797f, 18.1429f, 20.031f, 18.1429f)
        horizontalLineTo(20.7829f)
        curveTo(21.3104f, 18.1429f, 21.5741f, 18.1429f, 21.7379f, 17.9755f)
        curveTo(22.1045f, 17.6011f, 22.0698f, 15.7921f, 21.7379f, 15.4531f)
        curveTo(21.5741f, 15.2857f, 21.3104f, 15.2857f, 20.7829f, 15.2857f)
        horizontalLineTo(11.4552f)
        curveTo(10.8267f, 13.9343f, 9.47817f, 13f, 7.91602f, 13f)
        curveTo(5.75326f, 13f, 4f, 14.7909f, 4f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00896f, 17f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12.5f)
        verticalLineTo(9f)
        curveTo(19f, 6.17157f, 19f, 4.75736f, 18.1213f, 3.87868f)
        curveTo(17.2426f, 3f, 15.8284f, 3f, 13f, 3f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
        curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
        verticalLineTo(14f)
        }
        }.build()

        return _authorized!!
    }

private var _authorized: ImageVector? = null
