package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserSettings01: ImageVector
    get() {
        if (_userSettings01 != null) {
            return _userSettings01!!
        }
        _userSettings01 = ImageVector.Builder(
            name = "UserSettings01",
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
        moveTo(14.5f, 7.5f)
        curveTo(14.5f, 4.73858f, 12.2614f, 2.5f, 9.5f, 2.5f)
        curveTo(6.73858f, 2.5f, 4.5f, 4.73858f, 4.5f, 7.5f)
        curveTo(4.5f, 10.2614f, 6.73858f, 12.5f, 9.5f, 12.5f)
        curveTo(12.2614f, 12.5f, 14.5f, 10.2614f, 14.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 19.5f)
        curveTo(2.5f, 15.634f, 5.63401f, 12.5f, 9.5f, 12.5f)
        curveTo(10.5736f, 12.5f, 11.5907f, 12.7417f, 12.5f, 13.1736f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 20f)
        curveTo(18.9293f, 20f, 19.7402f, 19.493f, 20.171f, 18.7404f)
        moveTo(18f, 20f)
        curveTo(17.0707f, 20f, 16.2598f, 19.493f, 15.829f, 18.7404f)
        moveTo(18f, 20f)
        lineTo(18f, 21.5f)
        moveTo(18f, 15f)
        curveTo(18.9292f, 15f, 19.74f, 15.5069f, 20.1709f, 16.2593f)
        moveTo(18f, 15f)
        curveTo(17.0708f, 15f, 16.26f, 15.5069f, 15.8291f, 16.2593f)
        moveTo(18f, 15f)
        lineTo(18f, 13.5f)
        moveTo(21.5f, 15.4998f)
        lineTo(20.1709f, 16.2593f)
        moveTo(14.5f, 19.4998f)
        lineTo(15.829f, 18.7404f)
        moveTo(21.5f, 19.4998f)
        lineTo(20.171f, 18.7404f)
        moveTo(14.5f, 15.4998f)
        lineTo(15.8291f, 16.2593f)
        moveTo(20.1709f, 16.2593f)
        curveTo(20.3803f, 16.6249f, 20.5f, 17.0485f, 20.5f, 17.5f)
        curveTo(20.5f, 17.9514f, 20.3804f, 18.3749f, 20.171f, 18.7404f)
        moveTo(15.829f, 18.7404f)
        curveTo(15.6196f, 18.3749f, 15.5f, 17.9514f, 15.5f, 17.5f)
        curveTo(15.5f, 17.0485f, 15.6197f, 16.6249f, 15.8291f, 16.2593f)
        }
        }.build()

        return _userSettings01!!
    }

private var _userSettings01: ImageVector? = null
