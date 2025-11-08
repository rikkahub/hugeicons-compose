package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Location08: ImageVector
    get() {
        if (_location08 != null) {
            return _location08!!
        }
        _location08 = ImageVector.Builder(
            name = "Location08",
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
        moveTo(18.9108f, 18f)
        curveTo(19.8247f, 19.368f, 20.2113f, 20.203f, 19.8865f, 20.8999f)
        curveTo(19.8466f, 20.9854f, 19.7999f, 21.0679f, 19.7469f, 21.1467f)
        curveTo(19.1724f, 22f, 17.6875f, 22f, 14.7178f, 22f)
        horizontalLineTo(9.28223f)
        curveTo(6.31251f, 22f, 4.82765f, 22f, 4.25311f, 21.1467f)
        curveTo(4.20005f, 21.0679f, 4.15339f, 20.9854f, 4.11355f, 20.8999f)
        curveTo(3.78869f, 20.203f, 4.17527f, 19.368f, 5.08915f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        curveTo(15f, 11.1569f, 13.6569f, 12.5f, 12f, 12.5f)
        curveTo(10.3431f, 12.5f, 9f, 11.1569f, 9f, 9.5f)
        curveTo(9f, 7.84315f, 10.3431f, 6.5f, 12f, 6.5f)
        curveTo(13.6569f, 6.5f, 15f, 7.84315f, 15f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(16.0588f, 2f, 19.5f, 5.42803f, 19.5f, 9.5869f)
        curveTo(19.5f, 13.812f, 16.0028f, 16.777f, 12.7725f, 18.7932f)
        curveTo(12.5371f, 18.9287f, 12.2709f, 19f, 12f, 19f)
        curveTo(11.7291f, 19f, 11.4629f, 18.9287f, 11.2275f, 18.7932f)
        curveTo(8.00325f, 16.7573f, 4.5f, 13.8266f, 4.5f, 9.5869f)
        curveTo(4.5f, 5.42803f, 7.9412f, 2f, 12f, 2f)
        }
        }.build()

        return _location08!!
    }

private var _location08: ImageVector? = null
