package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Subpoena: ImageVector
    get() {
        if (_subpoena != null) {
            return _subpoena!!
        }
        _subpoena = ImageVector.Builder(
            name = "Subpoena",
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
        moveTo(3f, 14f)
        verticalLineTo(10f)
        curveTo(3f, 6.22876f, 3f, 4.34315f, 4.17157f, 3.17157f)
        curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 2f, 18.6569f, 2f, 19.8284f, 3.17157f)
        curveTo(21f, 4.34315f, 21f, 6.22876f, 21f, 10f)
        verticalLineTo(14f)
        curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
        curveTo(18.6569f, 22f, 16.7712f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
        curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 3f)
        lineTo(5.825f, 5.12f)
        curveTo(6.3994f, 6.03905f, 6.68661f, 6.49857f, 7.13896f, 6.74928f)
        curveTo(7.59131f, 7f, 8.1332f, 7f, 9.21699f, 7f)
        horizontalLineTo(14.783f)
        curveTo(15.8668f, 7f, 16.4087f, 7f, 16.861f, 6.74928f)
        curveTo(17.3134f, 6.49857f, 17.6006f, 6.03905f, 18.175f, 5.12f)
        lineTo(19.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.75f, 15.25f)
        curveTo(12.9368f, 16.4368f, 14.5f, 17.6429f, 14.5f, 17.6429f)
        lineTo(16.6429f, 15.5f)
        curveTo(16.6429f, 15.5f, 15.4368f, 13.9368f, 14.25f, 12.75f)
        curveTo(13.0632f, 11.5632f, 11.5f, 10.3571f, 11.5f, 10.3571f)
        lineTo(9.35714f, 12.5f)
        curveTo(9.35714f, 12.5f, 10.5632f, 14.0632f, 11.75f, 15.25f)
        moveTo(11.75f, 15.25f)
        lineTo(8f, 19f)
        moveTo(17f, 15.1429f)
        lineTo(14.1429f, 18f)
        moveTo(11.8571f, 10f)
        lineTo(9f, 12.8571f)
        }
        }.build()

        return _subpoena!!
    }

private var _subpoena: ImageVector? = null
