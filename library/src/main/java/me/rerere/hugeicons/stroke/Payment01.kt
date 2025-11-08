package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Payment01: ImageVector
    get() {
        if (_payment01 != null) {
            return _payment01!!
        }
        _payment01 = ImageVector.Builder(
            name = "Payment01",
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
        moveTo(13.5f, 15f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 15f, 3.17157f, 15f, 2.58579f, 14.4142f)
        curveTo(2f, 13.8284f, 2f, 12.8856f, 2f, 11f)
        verticalLineTo(7f)
        curveTo(2f, 5.11438f, 2f, 4.17157f, 2.58579f, 3.58579f)
        curveTo(3.17157f, 3f, 4.11438f, 3f, 6f, 3f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 3f, 20.8284f, 3f, 21.4142f, 3.58579f)
        curveTo(22f, 4.17157f, 22f, 5.11438f, 22f, 7f)
        verticalLineTo(12f)
        curveTo(22f, 12.9319f, 22f, 13.3978f, 21.8478f, 13.7654f)
        curveTo(21.6448f, 14.2554f, 21.2554f, 14.6448f, 20.7654f, 14.8478f)
        curveTo(20.3978f, 15f, 19.9319f, 15f, 19f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 9f)
        curveTo(14f, 10.1045f, 13.1046f, 11f, 12f, 11f)
        curveTo(10.8954f, 11f, 10f, 10.1045f, 10f, 9f)
        curveTo(10f, 7.89543f, 10.8954f, 7f, 12f, 7f)
        curveTo(13.1046f, 7f, 14f, 7.89543f, 14f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 17f)
        curveTo(13f, 15.3431f, 14.3431f, 14f, 16f, 14f)
        verticalLineTo(12f)
        curveTo(16f, 10.3431f, 17.3431f, 9f, 19f, 9f)
        verticalLineTo(14.5f)
        curveTo(19f, 16.8346f, 19f, 18.0019f, 18.5277f, 18.8856f)
        curveTo(18.1548f, 19.5833f, 17.5833f, 20.1548f, 16.8856f, 20.5277f)
        curveTo(16.0019f, 21f, 14.8346f, 21f, 12.5f, 21f)
        horizontalLineTo(12f)
        curveTo(10.1362f, 21f, 9.20435f, 21f, 8.46927f, 20.6955f)
        curveTo(7.48915f, 20.2895f, 6.71046f, 19.5108f, 6.30448f, 18.5307f)
        curveTo(6f, 17.7956f, 6f, 16.8638f, 6f, 15f)
        }
        }.build()

        return _payment01!!
    }

private var _payment01: ImageVector? = null
