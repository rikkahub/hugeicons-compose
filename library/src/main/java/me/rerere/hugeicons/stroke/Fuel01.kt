package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fuel01: ImageVector
    get() {
        if (_fuel01 != null) {
            return _fuel01!!
        }
        _fuel01 = ImageVector.Builder(
            name = "Fuel01",
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
        moveTo(10.1115f, 4.5f)
        horizontalLineTo(8f)
        curveTo(6.11438f, 4.5f, 5.17157f, 4.5f, 4.58579f, 5.08579f)
        curveTo(4f, 5.67157f, 4f, 6.61438f, 4f, 8.5f)
        verticalLineTo(16f)
        curveTo(4f, 18.8284f, 4f, 20.2426f, 4.87868f, 21.1213f)
        curveTo(5.75736f, 22f, 7.17157f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(16.8284f, 22f, 18.2426f, 22f, 19.1213f, 21.1213f)
        curveTo(20f, 20.2426f, 20f, 18.8284f, 20f, 16f)
        verticalLineTo(13.4443f)
        curveTo(20f, 11.0386f, 20f, 9.83582f, 19.4026f, 8.86921f)
        curveTo(18.8052f, 7.9026f, 17.7294f, 7.36469f, 15.5777f, 6.28885f)
        lineTo(13.6892f, 5.34458f)
        curveTo(12.8484f, 4.9242f, 12.428f, 4.71401f, 11.9747f, 4.607f)
        curveTo(11.5215f, 4.5f, 11.0515f, 4.5f, 10.1115f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        curveTo(13.1046f, 18f, 14f, 17.1605f, 14f, 16.125f)
        curveTo(14f, 14.875f, 12f, 13f, 12f, 13f)
        curveTo(12f, 13f, 10f, 14.875f, 10f, 16.125f)
        curveTo(10f, 17.1605f, 10.8954f, 18f, 12f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 8f)
        lineTo(16.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 4.5f)
        verticalLineTo(3.75f)
        curveTo(6f, 3.04777f, 6f, 2.69665f, 6.16853f, 2.44443f)
        curveTo(6.24149f, 2.33524f, 6.33524f, 2.24149f, 6.44443f, 2.16853f)
        curveTo(6.69665f, 2f, 7.04777f, 2f, 7.75f, 2f)
        curveTo(8.45223f, 2f, 8.80335f, 2f, 9.05557f, 2.16853f)
        curveTo(9.16476f, 2.24149f, 9.25851f, 2.33524f, 9.33147f, 2.44443f)
        curveTo(9.5f, 2.69665f, 9.5f, 3.04777f, 9.5f, 3.75f)
        verticalLineTo(4.5f)
        }
        }.build()

        return _fuel01!!
    }

private var _fuel01: ImageVector? = null
